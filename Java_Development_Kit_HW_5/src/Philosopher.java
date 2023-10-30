/**
 * Формулировка задачи:
 * Есть пять философов (потоки), которые могут либо обедать либо размышлять.
 * Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
 * После каждого приема пищи философ должен размышлять
 * Не должно возникнуть общей блокировки
 * Философы не должны есть больше одного раза подряд
 */
public class Philosopher implements Runnable {

    private final String name;
    private final Object monitor;
    private ThreadLocal<Integer> flagEaten = ThreadLocal.withInitial(()->3);

    public Philosopher(String name) {
        this.monitor = Philosopher.class;
        this.name = name;
    }

    @Override
    public void run() {
        while (this.flagEaten.get() > 0) {
            try {
                this.eating();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void eating() throws InterruptedException {
        synchronized (monitor) {
            System.out.println(this.name + " - начал кушать.");
            flagEaten.set(this.flagEaten.get() - 1);
            Thread.sleep(500);
            System.out.println(this.name + " - закончил кушать.");
            System.out.println(this.name + " - начал размышлять.");
            System.out.println(this.name + "---------осталось "+ this.flagEaten.get() +" раза покушать-----------");
            monitor.wait(500);
        }
    }
}

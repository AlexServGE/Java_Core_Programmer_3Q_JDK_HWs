/**
 * Формулировка задачи:
 * Есть пять философов (потоки), которые могут либо обедать либо размышлять.
 * Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
 * После каждого приема пищи философ должен размышлять
 * Не должно возникнуть общей блокировки
 * Философы не должны есть больше одного раза подряд
 */
public class Main {



    public static void main(String[] args) {

        new Thread(new Philosopher("Петя")).start();
        new Thread(new Philosopher("Катя")).start();
        new Thread(new Philosopher("Вася")).start();
        new Thread(new Philosopher("Дима")).start();
        new Thread(new Philosopher("Аня")).start();

    }
}
/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 */

public class Main {
    public static void main(String[] args) {
        Pair<Integer,String> myPair = new Pair<>(1,"Alex");
        System.out.println(myPair);
    }
}
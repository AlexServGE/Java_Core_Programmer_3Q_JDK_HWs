/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(2,2.0));
        System.out.println(Calculator.multiply(2,2.0));
        System.out.println(Calculator.divide(2,2.0));
        System.out.println(Calculator.subtract(2,2.0));

    }
}
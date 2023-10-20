/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {

    public static <T extends Number,K extends Number> int sum(T num1, K num2) {
        return num1.intValue()+num2.intValue();
    }

    public static <T extends Number,K extends Number> int multiply(T num1, K num2) {
        return num1.intValue()*num2.intValue();
    }

    public static <T extends Number,K extends Number> int divide(T num1, K num2) {
        return num1.intValue()/num2.intValue();
    }

    public static <T extends Number, K extends Number> int subtract(T num1, K num2) {
        return num1.intValue() - num2.intValue();
    }

}

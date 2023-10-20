import java.util.Arrays;
import java.util.List;

/**
 * Описать собственную коллекцию - список на основе массива. Каоллекция должна иметь
 * возможность хранить любые типы данных, иметь методы добавления и удаления элементов
 *
 * Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
 * чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 *
 */
public class Main {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<>();
        mc.add("1");
        mc.add("1");
        mc.add("0");
        mc.remove(2);
        mc.add("1");
        mc.add("1");

        for (String el: mc){
            System.out.println(el);
        }




    }
}
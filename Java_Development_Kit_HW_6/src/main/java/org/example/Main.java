package org.example;
import java.util.*;

/**
 * В качестве домашнего задания студентам будет предложена задача реализовать Java приложение для демонстрации парадокса
 * Монти Холла (Парадокс Монти Холла — Википедия) и наглядно убедиться в верности парадокса (запустить игру в цикле на 1000 и вывести итоговый счет).
 * Студенту необходимо:
 * Создать свой Java Maven/Gradle проект;
 * Реализовать прикладную задачу - приложение для демонстрации парадокса Монти Холла;
 * Можно добавить любые библиотеки которые считают необходимыми
 * Результаты должны быть сохранены в HashMap (шаг цикла -> результат)
 * Необходимо вывести статистику по результату - количество позитивных и негативных результатов, процент от общего количества шагов цикла.
 */

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> results1 = new HashMap<>();
        Map<Integer, String> results2 = new HashMap<>();
        Random rnd = new Random();
        int iterations = 1000;
        for (int i = 0; i < iterations; i++) {
            List<String> doors = new ArrayList<>(Arrays.asList("Пусто", "Пусто", "Пусто"));
            doors.set(rnd.nextInt(3), "Подарок");
            int userSelection = rnd.nextInt(3);
            //Выриант выбор без изменения выбора
            if (doors.get(userSelection).equals("Подарок")) {
                results1.put(i, "Подарок");
            }
            //Выриант выбор с изменением выбора
            doors.remove(userSelection);
            doors.remove("Пусто");
            if (doors.get(0).equals("Подарок")) {
                results2.put(i, "Подарок");
            }
        }
        System.out.printf("Количество побед без изменения выбора: %f%%", (double) results1.values().size() / iterations * 100);
        System.out.println();
        System.out.printf("Количество побед c изменением выбора: %f%%", (double) results2.values().size() / iterations * 100);
    }
}
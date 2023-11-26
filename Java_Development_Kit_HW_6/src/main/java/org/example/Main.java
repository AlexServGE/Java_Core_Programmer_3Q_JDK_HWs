package org.example;


import java.sql.SQLOutput;
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
        List<String> doors = new ArrayList<>(Arrays.asList("Подарок", "Пусто", "Пусто"));
        List<String> doors1 = new ArrayList<>(Arrays.asList("Пусто", "Подарок", "Пусто"));
        List<String> doors2 = new ArrayList<>(Arrays.asList("Пусто", "Пусто", "Подарок"));
        List<List<String>> doorsVariants = new ArrayList<>(Arrays.asList(doors, doors1, doors2));
        int iterations = 1000;
        int userSelection = 0;
        for (int i = 0; i < iterations;) {
            for (List<String> doorsVariant : doorsVariants) {
                List<String> doorsTemp = new ArrayList<>(doorsVariant);
                //Выриант выбор без изменения выбора
                if (doorsTemp.get(userSelection).equals("Подарок")) {
                    results1.put(i, "Подарок");
                }
                //Выриант выбор с изменением выбора
                doorsTemp.remove(userSelection);
                doorsTemp.remove("Пусто");
                if (doorsTemp.get(0).equals("Подарок")) {
                    results2.put(i, "Подарок");
                }
                i++;
            }
        }
        System.out.printf("Количество побед без изменения выбора: %f%%",(double) results1.values().size()/iterations*100);
        System.out.println();
        System.out.printf("Количество побед c изменением выбора: %f%%",(double) results2.values().size()/iterations*100);
    }
}
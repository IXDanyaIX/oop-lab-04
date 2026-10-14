package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // 1. Среднее значение
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        double average =
                StreamTasks.average(numbers);

        System.out.println("1. Среднее: " + average);


        // 2. Верхний регистр + "_new_"
        List<String> strings =
                Arrays.asList("hello", "world", "java");

        List<String> newStrings =
                StreamTasks.addPrefix(strings);

        System.out.println("2. Строки: " + newStrings);


        // 3. Квадраты уникальных элементов
        List<Integer> numbersWithDuplicates =
                Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> squares =
                StreamTasks.uniqueSquares(numbersWithDuplicates);

        System.out.println("3. Квадраты уникальных: " + squares);


        // 4. Последний элемент
        List<String> names =
                Arrays.asList("Alex", "Bob", "Dan");

        String last =
                StreamTasks.getLastElement(names);

        System.out.println("4. Последний элемент: " + last);


        // 5. Сумма чётных чисел
        int[] array =
                {1, 2, 3, 4, 5, 6};

        int sum =
                StreamTasks.sumEven(array);

        System.out.println("5. Сумма чётных: " + sum);


        // 6. Строки -> Map
        List<String> words =
                Arrays.asList("apple", "banana", "grape");

        Map<Character, String> map =
                StreamTasks.stringsToMap(words);

        System.out.println("6. Map: " + map);
    }
}
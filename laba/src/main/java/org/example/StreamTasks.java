package org.example;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTasks {

    // 1. Среднее значение списка целых чисел
    public static double average(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }


    // 2. Перевод всех строк в верхний регистр
    //    и добавление префикса "_new_"
    public static List<String> addPrefix(List<String> strings) {
        return strings.stream()
                .map(s -> "_new_" + s.toUpperCase())
                .collect(Collectors.toList());
    }


    // 3. Квадраты элементов, которые встречаются только один раз
    public static List<Integer> uniqueSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(number ->
                        numbers.stream()
                                .filter(n -> n.equals(number))
                                .count() == 1)
                .map(number -> number * number)
                .collect(Collectors.toList());
    }


    // 4. Последний элемент коллекции
    public static <T> T getLastElement(Collection<T> collection) {
        return collection.stream()
                .reduce((first, second) -> second)
                .orElseThrow(
                        () -> new IllegalArgumentException(
                                "Коллекция пуста"
                        )
                );
    }


    // 5. Сумма чётных чисел массива
    public static int sumEven(int[] numbers) {
        return java.util.Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .sum();
    }


    // 6. Преобразование строк в Map:
    //    первый символ -> ключ,
    //    оставшиеся символы -> значение
    public static Map<Character, String> stringsToMap(List<String> strings) {
        return strings.stream()
                .collect(Collectors.toMap(
                        s -> s.charAt(0),
                        s -> s.substring(1)
                ));
    }
}
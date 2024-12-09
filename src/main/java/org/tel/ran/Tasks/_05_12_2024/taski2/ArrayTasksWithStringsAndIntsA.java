package org.tel.ran.Tasks._05_12_2024.taski2;

import java.util.Arrays;

public class ArrayTasksWithStringsAndIntsA {

    // 1. Найти сумму элементов массива целых чисел.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
    }

    // 2. Найти длину самой длинной строки в массиве строк.
    public static void task2() {
        String[] array = {"cat", "elephant", "hippopotamus", "zebra"};
        System.out.println("array = " + Arrays.toString(array));
        int maxLength = array[0].length();

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
            }
        }
        System.out.println("maxLength = " + maxLength);
    }

    // 3. Проверить, содержит ли массив строк заданное слово.
    public static void task3() {
        String[] array = {"apple", "banana", "cherry", "mango", "peach"};
        String target = "banana";
        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);

        boolean containsTarget = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                containsTarget = true;
                break;
            }
        }

        System.out.println("containsTarget = " + containsTarget);
    }

    // 4. Подсчитать количество строк, содержащих заданный символ.
    public static void task4(char target) {
        String[] array = {"apple", "banana", "cherry", "mango", "peach"};
        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);

        int countOfLinesContainingTarget = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == target){
                    countOfLinesContainingTarget++;
                    break;
                }
            }
        }
        System.out.println("countOfLinesContainingTarget = " + countOfLinesContainingTarget);
    }

    // 5. Найти строку с максимальным количеством символов 'e'.
    public static void task5(char target) {
        String[] array = {"elephant", "eagle", "dog", "zebra", "rabbit", "cat", "bat"};
        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);
        String maxString = "";
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == target) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxString = array[i];
            }
        }
        System.out.println("maxCount = " + maxCount + ", maxString = " + maxString);
    }

    // 6. Удалить из массива строк все строки, содержащие заданное слово.
    public static void task6() {
        String[] array = {"apple pie", "banana bread", "cherry tart"};
        String target = "bread";
        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);

        int countTarget = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(target)){
                countTarget++;
            }
        }
        System.out.println("countTarget = " + countTarget);
        String[] reducedArray = new String[array.length - countTarget];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(target)) {
                reducedArray[j] = array[i];
                j++;
            }
        }
        System.out.println("reducedArray = " + Arrays.toString(reducedArray));
    }

    // 7. Найти минимальный элемент массива целых чисел.
    public static void task7() {
        int[] array = {3, 1, 4, 1, 5};
        System.out.println("array = " + Arrays.toString(array));

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }

    // 8. Найти строку с минимальной длиной.
    public static void task8() {
        String[] array = {"cat", "elephant", "dog", "bat", "ox"};
        System.out.println("array = " + Arrays.toString(array));

        int minLength = array[0].length();
        int countMin = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < minLength) {
                countMin = 1;
                minLength = array[i].length();
            } else if (array[i].length() == minLength) {
                countMin++;
            }
        }

        String[] arrayMin = new String[countMin];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == minLength) {
                arrayMin[k] = array[i];
                k++;
            }
        }

        System.out.println("minLength = " + minLength);
        System.out.println("minSting = " + Arrays.toString(arrayMin));
    }

    // 9. Подсчитать количество четных чисел в массиве.
    public static void task9() {
        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.println("array = " + Arrays.toString(array));

        int countEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("countEven = " + countEven);
    }

    // 10. Найти строку, которая встречается чаще всего.
    public static void task10() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
        System.out.println("array = " + Arrays.toString(array));
        String mostFrequent = "";
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int currentCount = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j]) && j != i) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostFrequent = array[i];
            }
        }

        System.out.println("maxCount = " + maxCount);
        System.out.println("mostFrequent = " + mostFrequent);
    }
}
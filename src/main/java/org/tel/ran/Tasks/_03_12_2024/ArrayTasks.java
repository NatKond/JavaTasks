package org.tel.ran.Tasks._03_12_2024;

import java.util.Arrays;

public class ArrayTasks {

    // 1. Найти сумму элементов массива.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
    }

    // 2. Найти минимальный элемент массива.
    public static void task2() {
        int[] array = {4, 2, -1, 7};
        System.out.println("array = " + Arrays.toString(array));

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }

    // 3. Найти максимальный элемент массива.
    public static void task3() {
        int[] array = {4, 2, -1, 7};
        System.out.println("array = " + Arrays.toString(array));
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }

    // 4. Найти индекс минимального элемента массива.
    public static void task4() {
        int[] array = {4, 2, -1, 7};
        System.out.println("array = " + Arrays.toString(array));

        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexMin]) {
                    indexMin = i;
            }
        }
        System.out.println("indexMin = " + indexMin);
    }

    // 5. Найти индекс максимального элемента массива.
    public static void task5() {
        int[] array = {4, 2, -1, 7};
        System.out.println("array = " + Arrays.toString(array));

        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println("indexMax = " + indexMax);

    }

    // 6. Посчитать количество положительных элементов.
    public static void task6() {
        int[] array = {4, -2, 0, 7};
        System.out.println("array = " + Arrays.toString(array));

        int countPositives = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositives++;
            }
        }
        System.out.println("countPositives = " + countPositives);
    }

    // 7. Посчитать количество отрицательных элементов.
    public static void task7() {
        int[] array = {4, -2, 0, -7};
        System.out.println("array = " + Arrays.toString(array));

        int countNegatives = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegatives++;
            }
        }
        System.out.println("countNegatives = " + countNegatives);
    }

    // 8. Посчитать количество четных элементов.
    public static void task8() {
        int[] array = {4, -2, 0, 7};
        System.out.println("array = " + Arrays.toString(array));

        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("countEven = " + countEven);

    }

    // 9. Посчитать количество нечетных элементов.
    public static void task9() {
        int[] array = {4, -2, 0, 7};
        System.out.println("array = " + Arrays.toString(array));

            int countOdd = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    countOdd++;
                }
            }
            System.out.println("countOdd = " + countOdd);
    }

    // 10. Проверить, есть ли в массиве заданное число.
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        int target = 0;
        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);

        boolean containsTarget = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                containsTarget = true;
            }
        }
        System.out.println("containsTarget = " + containsTarget);
    }

    // 11. Найти среднее арифметическое элементов массива.
    public static void task11() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum/array.length;
        System.out.println("average = " + average);
    }

    // 12. Вывести все элементы массива, которые больше среднего значения.
    public static void task12() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum/array.length;
        System.out.println("average = " + average);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average){
                System.out.println("array[" + i + "] = " + array[i] + " is above average");
            }
        }
    }

    // 13. Проверить, упорядочен ли массив по возрастанию.
    public static void task13() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        boolean isMonotone = true;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]){
                isMonotone = false;
            }
        }
        System.out.println("isMonotone = " + isMonotone);
    }

    // 14. Найти второй по величине элемент массива.
    public static void task14() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        int firstMin = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < firstMin){
                firstMin = array[i];
            }
            /*if (array[i] < firstMin){
                secondMin = firstMin;
                firstMin = array[i];
            }

            if (array[i] < secondMin && array[i] > firstMin){
                secondMin = array[i];
            }*/
        }
        int secondMin = array[0];
        if  (firstMin == array[0]){
            secondMin = array[1];
        }

        for (int i = 1; i < array.length; i++) {
            if ((array[i] < secondMin) && (array[i] > firstMin)){
                secondMin = array[i];
            }
        }

        System.out.println("secondMin = " + secondMin + ", firstMin = " + firstMin);
    }

    // 15. Переставить элементы массива в обратном порядке.
    public static void task15() {
        int[] array = {1, 2, 3, 4};
        System.out.println("array = " + Arrays.toString(array));

        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[(array.length - 1) - i] = array[i];
        }
        System.out.println("reverse = " + Arrays.toString(reverse));
    }
}
package org.tel.ran.Tasks._03_12_2024;

import java.util.Arrays;

public class ArrayTasksExtended {

    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array [j] == target){
                    System.out.println("array[" + i + "] + array [" + j + "] = " + array[i] + " + " + array[j] + " = "  + (array[i] + array[j]));
                }
            }
        }
    }

    // 17. Проверить, есть ли в массиве дубликаты.
    public static void task17() {
        int[] array = {1, 2, 3, 4, 2};
        System.out.println("array = " + Arrays.toString(array));
        boolean hasDuplicates = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) {
                break;
            }
        }
        System.out.println("hasDuplicates = " + hasDuplicates);
    }

    // 18. Удалить все нули из массива и сдвинуть элементы влево.
    public static void task18() {
        int[] array = {0, 1, 0, 3, 0};
        System.out.println("array = " + Arrays.toString(array));

        int countZero = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 0 ){
                countZero++;
            }
        }

        int[] reducedArray = new int [array.length - countZero];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                reducedArray[j] = array[i];
                j++;
            }
        }
        array = reducedArray;
        System.out.println("array = " + Arrays.toString(array) + " does not contain zeros.");
    }

    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 20, 25, 30, 23};
        int divisor = 5;
        System.out.println("array = " + Arrays.toString(array) + ", divisor = " + divisor);

        int countDivisible = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                countDivisible++;
            }
        }
        System.out.println("countDivisible = " + countDivisible);
    }

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};
        System.out.println("array = " + Arrays.toString(array));
        
        //первый вариант
        /* 
        for (int i = 0; i < array.length; i++) {

            int indexMin = i;
            for (int j = i; j < array.length; j++) {
                if (array[indexMin] > array[j]) {
                    indexMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexMin];
            array[indexMin]=temp;

        }*/
        
        //второй вариант
        boolean isArrayOrdered = false;
        while (!isArrayOrdered){
            isArrayOrdered = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array [i+1]) {
                    int temp = array[i];
                    array[i] = array [i+1];
                    array[i+1] = temp;
                    isArrayOrdered = false;
                }
            }
        }
        System.out.println("array = " + Arrays.toString(array) + " is ordered");
    }

    // 22. Найти индекс первого отрицательного элемента.
    public static void task22() {
        int[] array = {1, 2, -3, 4, -5};
        System.out.println("array = " + Arrays.toString(array));
        int firstNegativeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        System.out.println("firstNegativeIndex = " + firstNegativeIndex);
    }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
        int sumEvenIndexes = 0;
        for (int i = 0; i < array.length; i += 2) {
            sumEvenIndexes += array[i];
        }
        System.out.println("sumEvenIndexes = " + sumEvenIndexes);
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
        int mul = array[0];
        for (int i = 1; i < array.length; i++) {
            mul *=array[i];
        }
        System.out.println("mul = " + mul);
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 7};
        System.out.println("array = " + Arrays.toString(array));

        int end = array.length - 1;
        for (int i = 0; i < end; i++) {
            if (array[i] < 0) {
                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;
                end--;
            }
        }
        System.out.println("array = " + Arrays.toString(array) + ", all negative values are at the end");
    }

    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
        int countUniqueValue = 0;
        boolean isUnique = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && j != i) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                countUniqueValue++;
            } else {
                isUnique = true;
            }
        }
        System.out.println("countUniqueValue = " + countUniqueValue);
    }

    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
        System.out.println("array = " + Arrays.toString(array));

        int minI = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minI]) {
                minI = i;
            }
        }
        int temp = array[minI];
        array[minI] = array[0];
        array[0] = temp;
        System.out.println("array = " + Arrays.toString(array) + ", minimum value is first");
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3, 3};
        System.out.println("array = " + Arrays.toString(array));

        int maxSequenceLength = 0;
        for (int i = 0; i < array.length; i++) {
            /*
            int currentSequenceLength = 1;
            for (int j = 1; i + j < array.length; j++) {
                if (array[i] != array[i + j]) {
                    break;
                }
            }*/
            int j = 1;
            while (i + j < array.length && array[i] == array [i + j]){
                j++;
            }
            i = i + j - 1;
            if (j > maxSequenceLength) {
                maxSequenceLength = j;
            }
        }
        System.out.println("maxSequenceLength = " + maxSequenceLength);
    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};
        System.out.println("array = " + Arrays.toString(array));
        int indFirstZero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                indFirstZero = i;
                break;
            }
        }
        int sumPositivesAfterFirstNegative = 0;
        for (int i = indFirstZero; i < array.length; i++) {
            if (array[i] > 0) {
                sumPositivesAfterFirstNegative += array[i];
            }
        }
        System.out.println("sumPositivesAfterFirstNegative = " + sumPositivesAfterFirstNegative);
    }

    // 30. Удалить все дубликаты из массива.
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("array = " + Arrays.toString(array));

        boolean isDublicate = false;
        int countUniqueValue = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (array[i] == array[j]) {
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                countUniqueValue++;
            } else {
                isDublicate = false;
            }
        }

        int[] reducedArray = new int [countUniqueValue];
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (array[i] == array[j]) {
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                reducedArray[k] = array[i];
                k++;
            } else {
                isDublicate = false;
            }
        }
        array = reducedArray;
        System.out.println("array = " + Arrays.toString(array) + " does not contain duplicates");
    }

}
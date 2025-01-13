package org.tel.ran.Tasks._19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;

public class T4 {

    /**
     * 1. Напишите метод, который принимает массив целых чисел и удваивает каждый его элемент.
     */
    public static int[] doubleArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) array[i] *= 2;
        return array;
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и
     * возвращает массив только с положительными числами.
     */
    public static int[] filterPositiveNumbers(int[] array) {
        ArrayList<Integer> arrayListPos = new ArrayList<Integer>();
        for (int number : array) if (number > 0) arrayListPos.add(number);

        int[] arrayPos = new int[arrayListPos.size()];
        for (int i = 0; i < arrayListPos.size(); i++) {
            arrayPos[i] = arrayListPos.get(i);
        }
        return arrayPos;
    }

    /**
     * 3. Напишите метод, который принимает два массива
     * целых чисел и возвращает их объединение.
     */
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] combinedArray = new int [array1.length + array2.length];
        for (int i = 0; i < Math.max(array1.length, array2.length); i++) {
            if (i < array1.length) combinedArray[i] = array1[i];
            if (i < array2.length) combinedArray[i + array1.length] = array2[i];
        }
        return combinedArray;
    }

    /**
     * 4. Напишите метод, который принимает массив целых
     * чисел и возвращает количество уникальных элементов.
     */
    public static int countUniqueElements(int[] array) {
        int countUnique = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) countUnique++;
        }
        return countUnique;
    }

    /**
     * 5. Напишите метод, который принимает массив целых
     * чисел и возвращает новый массив, содержащий квадраты элементов исходного массива.
     */
    public static int[] squareArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) array[i] *= array[i];
        return array;
    }

    /**
     * 6. Напишите метод, который принимает массив целых чисел и возвращает второй по величине элемент.
     */
    public static int findSecondLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    /**
     * 7. Напишите метод, который принимает массив целых чисел и
     * возвращает true, если массив содержит заданное число.
     */
    public static boolean containsNumber(int[] array, int number) {
        for (int i: array){
            if (i == number) return true;
        }
        return false;
    }

    /**
     * 8. Напишите метод, который принимает массив целых чисел
     * и заменяет все отрицательные числа на 0.
     */
    public static int[] replaceNegativesWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = 0;
        }
        return array;
    }

    /**
     * 9. Напишите метод, который принимает массив целых
     * чисел и возвращает индекс первого вхождения заданного числа.
     */
    public static int findFirstIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    /**
     * 10. Напишите метод, который принимает массив целых ч
     * исел и возвращает true, если в массиве нет повторяющихся элементов.
     */
    public static boolean hasNoDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("doubleArrayElements(new int[]{1, -5, 3, 4, -2, 6}) = " + Arrays.toString(doubleArrayElements(new int[]{1, -5, 3, 4, -2, 6})));
        System.out.println("filterPositiveNumbers(new int[]{1, -5, 3, 4, -2, 6}) = " + Arrays.toString(filterPositiveNumbers(new int[]{1, -5, 3, 4, -2, 6})));
        System.out.println("mergeArrays(new int[]{1, -5, 3}, (new int[]{4, -2, 6})) = " + Arrays.toString(mergeArrays(new int[]{1, -5, 3}, (new int[]{4, -2, 6}))));
        System.out.println("countUniqueElements(new int[]{1, 4, 3, 4, 3, 6, 5}) = " + countUniqueElements(new int[]{1, 4, 3, 4, 3, 6, 5}));
        System.out.println("squareArrayElements(new int[]{1, -5, 3, 4, -2, 6}) = " + Arrays.toString(squareArrayElements(new int[]{1, -5, 3, 4, -2, 6})));
        System.out.println("findSecondLargest(new int[]{1, -5, 3, 4, -2, 6}) = " + findSecondLargest(new int[]{1, -5, 3, 4, -2, 6}));
        System.out.println("containsNumber(new int[]{1, -5, 3, 4, -2, 6},5) = " + containsNumber(new int[]{1, -5, 3, 4, -2, 6}, 5));
        System.out.println("replaceNegativesWithZero(new int[]{1, -5, 3, 4, -2, 6}) = " + Arrays.toString(replaceNegativesWithZero(new int[]{1, -5, 3, 4, -2, 6})));
        System.out.println("findFirstIndex(new int[]{1, -5, 3, 4, -2, 3}, 3) = " + findFirstIndex(new int[]{1, -5, 3, 4, -2, 3}, 3));
        System.out.println("hasNoDuplicates(new int[]{1, -5, 3, 4, -2, 6}) = " + hasNoDuplicates(new int[]{1, -5, 3, 4, -2, 6}));
    }
}

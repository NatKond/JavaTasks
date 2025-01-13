package org.tel.ran.Tasks._19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;

public class T3 {

    /**
     * 1. Напишите метод, который принимает массив целых чисел и возвращает его длину.
     */
    public static int getArrayLength(int[] array) {
        return array.length;
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и выводит его элементы в консоль.
     */
    public static void printArray(int[] array) {
        System.out.println("array = " + Arrays.toString(array));
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и возвращает сумму его элементов.
     */
    public static int sumArrayElements(int[] array) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * 4. Напишите метод, который принимает массив целых чисел и возвращает максимальный элемент.
     */
    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 5. Напишите метод, который принимает массив целых чисел и возвращает минимальный элемент.
     */
    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    /**
     * 6. Напишите метод, который принимает массив целых чисел и возвращает
     * новый массив, содержащий только чётные элементы.
     */
    public static int[] filterEvenNumbers(int[] array) {
        ArrayList<Integer> arrayListEven = new ArrayList<>();
        for (int number : array) {
            if (number % 2 == 0) arrayListEven.add(number);
        }

        int[] arrayEven = new int[arrayListEven.size()];
        for (int i = 0; i < arrayListEven.size(); i++) {
            arrayEven[i] = arrayListEven.get(i);
        }
        return arrayEven;
    }

    /**
     * 7. Напишите метод, который принимает массив целых чисел и
     * возвращает массив в обратном порядке.
     */
    public static int[] reverseArray(int[] array) {
        int[] arrayReverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReverse[array.length - 1 - i] = array[i];
        }
        return arrayReverse;
    }

    /**
     * 8. Напишите метод, который принимает массив целых чисел и возвращает true,
     * если массив отсортирован по возрастанию.
     */
    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 9. Напишите метод, который принимает массив целых чисел и возвращает
     * среднее арифметическое его элементов.
     */
    public static double calculateAverage(int[] array) {
        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    /**
     * 10. Напишите метод, который принимает массив целых чисел и
     * возвращает количество чётных чисел в массиве.
     */
    public static int countEvenNumbers(int[] array) {
        int countEven = 0;
        for (int number : array) {
            if (number % 2 == 0) countEven++;
        }
        return countEven;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 4, 2, 6};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("getArrayLength(array) = " + getArrayLength(array));
        printArray(array);
        System.out.println("sumArrayElements(array) = " + sumArrayElements(array));
        System.out.println("findMaxElement(array) = " + findMaxElement(array));
        System.out.println("findMinElement(array) = " + findMinElement(array));
        System.out.println("filterEvenNumbers(array) = " + Arrays.toString(filterEvenNumbers(array)));
        System.out.println("reverseArray(array) = " + Arrays.toString(reverseArray(array)));
        System.out.println("isArraySorted(array) = " + isArraySorted(array));
        System.out.println("calculateAverage(array) = " + calculateAverage(array));
        System.out.println("countEvenNumbers(array) = " + countEvenNumbers(array));
    }
}

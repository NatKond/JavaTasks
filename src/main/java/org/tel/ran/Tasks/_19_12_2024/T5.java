package org.tel.ran.Tasks._19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.tel.ran.Tasks._19_12_2024.T2.*;

public class T5 {


    /**
     * 1. Напишите метод, который принимает массив целых чисел и возвращает все подмассивы длиной 2.
     */
    public static int[][] generateSubArrays(int[] array) {
        int[][] subArrays = new int[array.length - 1] [2];
        for (int i = 0; i < array.length - 1; i++) {
            subArrays[i] = Arrays.copyOfRange(array,i,i + 2);
        }
        return subArrays;
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и возвращает true, если массив является палиндромом.
     */
    public static boolean isArrayPalindrome(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и возвращает самый часто встречающийся элемент.
     */
    public static int findMostFrequentElement(int[] array) {

        //без использования ArrayList
        boolean[] isComparedArrayEl = new boolean[array.length];
        int countMax = 0;
        int mostFrequentElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (!isComparedArrayEl[i]) {
                int count = 0;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j] && !isComparedArrayEl[i]) {
                        isComparedArrayEl[j] = true;
                        count++;
                    }
                }
                if (count > countMax) {
                    mostFrequentElement = array[i];
                    countMax = count;
                }
            }
            isComparedArrayEl[i] = true;
        }

        //с ArrayList

        ArrayList <Integer> uniqueElements = new ArrayList<>();
        for (int number : array) {
            if (!uniqueElements.contains(number))
                uniqueElements.add(number);
        }

        int mostFrequentElement2 = array[0];
        int countMax2 = 0;
        for (int element : uniqueElements ) {
            int count = 0;
            for (int number : array) {
                if (element == number) count++;
            }
            if (count > countMax2){
                countMax2 = count;
                mostFrequentElement2 = element;
            }
        }
        return mostFrequentElement2;
    }

    /**
     * 4. Напишите метод, который принимает массив целых чисел и
     * сортирует его без использования встроенных методов сортировки.
     */
    public static int[] sortArrayManually(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array,array.length);
        boolean isArrayOrdered = false;
        while (!isArrayOrdered){
            isArrayOrdered = true;
            for (int i = 0; i < arrayCopy.length - 1; i++) {
                if (arrayCopy[i] > arrayCopy [i + 1]) {
                    int temp = arrayCopy[i];
                    arrayCopy[i] = arrayCopy [i + 1];
                    arrayCopy[i + 1] = temp;
                    isArrayOrdered = false;
                }
            }
        }
        return arrayCopy;
    }

    /**
     * 5. Напишите метод, который принимает массив целых чисел и
     * переставляет элементы массива в случайном порядке.
     */
    public static int[] shuffleArray(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array,array.length);
        Random rnd = new Random();
        for (int i = 0; i < arrayCopy.length - 1; i++) {
            int randomIndex = rnd.nextInt(i+1,arrayCopy.length);
            int temp = arrayCopy[i];
            arrayCopy[i] = arrayCopy[randomIndex];
            arrayCopy[randomIndex] = temp;
        }
        return arrayCopy;
    }

    /**
     * 6. Напишите метод, который принимает массив целых
     * чисел и возвращает новый массив с уникальными элементами.
     */
    public static int[] removeDuplicates(int[] array) {
        ArrayList <Integer> uniqueElements = new ArrayList<>();
        for (int number : array) {
            if (!uniqueElements.contains(number))
                uniqueElements.add(number);
        }
        //int[] arrayUnique = uniqueElements.stream().mapToInt(i -> i).toArray();
        int[] arrayUnique = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) arrayUnique[i] = uniqueElements.get(i);
        return arrayUnique;
    }

    /**
     * 7. Напишите метод, который принимает массив целых
     * чисел и возвращает его циклически сдвинутым вправо на k позиций.
     */
    public static int[] rotateArrayRight(int[] array, int k) {
        //с созданием нового массива
        int[] rotatedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i + k < array.length) {
                rotatedArray[i + k] = array[i];
            }else{
                rotatedArray[(i + k) - array.length] = array[i];
            }
        }

        //без создания нового массива
        /*
        for (int i = 0; i < k; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
            }
            array[0] = temp;
        }*/
        return rotatedArray;
    }

    /**
     * 8. Напишите метод, который принимает два массива
     * целых чисел и возвращает их пересечение.
     */
    public static int[] findArrayIntersection(int[] array1, int[] array2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int number1: array1) {
            for (int number2: array2) {
                if (number1 == number2) {
                    if (!intersection.contains(number1)) intersection.add(number1);
                    break;
                }
            }
        }
        //int[] intersectionArray = intersection.stream().mapToInt(i -> i).toArray();
        int [] intersectionArray = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) intersectionArray[i] = intersection.get(i);
        return intersectionArray;
    }

    /**
     * 9. Напишите метод, который принимает массив целых чисел и
     * возвращает true, если в массиве есть дублирующиеся элементы.
     */
    public static boolean hasDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) return true;
            }
        }
        return false;
    }

    /**
     * 10. Напишите метод, который принимает массив целых чисел и
     * возвращает максимальную сумму подмассива (алгоритм Кадане).
     */
    public static int maxSubArraySum(int[] array) {
        /*
        //без алгоритма Кадане
        int[] arraySums = new int[array.length + 1];
        arraySums[0] = array[0];

        for (int i = 1; i < array.length + 1; i++) {
            arraySums[i] = array[0];
            for (int j = 0; j < array.length - i + 1; j++) {
                int[] subArray = Arrays.copyOfRange(array,j,j + i);
                int sum = 0;
                for (int value : subArray) sum += value;
                if (sum > arraySums[i]) arraySums[i] = sum;
            }
        }
        //с алгоритмом Кадане с использованием массивом
        int[] arraySums = new int[array.length];
        arraySums[0] = array[0];
        for (int i = 0; i < array.length - 1; i++) {

            arraySums[i + 1] = Math.max(arraySums[i] + array[i+1], array[i+1]);
        }*/

        //с алгоритмом Кадане без использования массива
        int maxSum = array[0];
        int currentSum = array[0];

        for (int i = 1; i < array.length; i++) {
            currentSum = Math.max(currentSum + array[i], array[i]);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("generateSubArrays(new int[] {1, 2, 3, 4, 5}) = " + Arrays.deepToString(generateSubArrays(new int[]{1, 2, 3, 4, 5})));
        System.out.println("isArrayPalindrome(new int[] {2, 4, 3, 4, 2}) = " + isArrayPalindrome(new int[]{2, 4, 3, 4, 2}));
        System.out.println("findMostFrequentElement(new int[] {2, 4, 5, 3, 5, 2, 3, 2, 5, 5}) = " + findMostFrequentElement(new int[]{2, 4, 5, 3, 5, 2, 3, 2, 5, 5}));
        System.out.println("sortArrayManually(new int[] {2, 4, 5, 1, 3}) = " + Arrays.toString(sortArrayManually(new int[]{2, 4, 5, 1, 3})));
        System.out.println("shuffleArray(new int[] {1, 2, 3, 4, 5}) = " + Arrays.toString(shuffleArray(new int[]{1, 2, 3, 4, 5})));
        System.out.println("removeDuplicates(new int[] {2, 4, 3, 5, 2, 4}) = " + Arrays.toString(removeDuplicates(new int[]{2, 4, 3, 5, 2, 4})));
        System.out.println("rotateArrayRight(new int[]{1, 2, 3, 4, 5}, 3)) = " + Arrays.toString(rotateArrayRight(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println("findArrayIntersection(new int[]{2, 3, 4, 1, 4, 2}, new int[]{1, 2, 3, 4, 5, 6}) = " + Arrays.toString(findArrayIntersection(new int[]{2, 3, 4, 1, 4, 2}, new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println("hasDuplicates(new int[]{1, 2, 3, 4, 5, 1}) = " + hasDuplicates(new int[]{1, 2, 3, 4, 5, 1}));
        System.out.println("maxSubArraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) = " + maxSubArraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
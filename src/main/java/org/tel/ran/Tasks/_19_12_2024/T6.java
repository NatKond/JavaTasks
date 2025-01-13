package org.tel.ran.Tasks._19_12_2024;

import java.util.Arrays;

public class T6 {
    /**
     * 1. Напишите метод, который принимает массив строк и возвращает его длину.
     */
    public static int getArrayLength(String[] array) {
        return array.length;
    }

    /**
     * 2. Напишите метод, который принимает массив строк и выводит его элементы в консоль.
     */
    public static void printArray(String[] array) {
        for (String s : array) System.out.print(s + " ");
        System.out.println();
    }

    /**
     * 3. Напишите метод, который принимает массив строк и возвращает первую строку.
     */
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * 4. Напишите метод, который принимает массив строк и возвращает последнюю строку.
     */
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * 5. Напишите метод, который принимает массив строк и возвращает массив строк в обратном порядке.
     */
    public static String[] reverseArray(String[] array) {
        String[] reversedArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - i - 1] = array[i];
        }
        return reversedArray;
    }

    /**
     * 6. Напишите метод, который принимает массив строк и возвращает длину самой длинной строки.
     */
    public static int getLongestStringLength(String[] array) {
        int countMax = 0;
        for (String s : array){
            int count = 0;
            for (char c : s.toCharArray()) count++;
            if (count > countMax) countMax = count;
        }
        return countMax;
    }

    /**
     * 7. Напишите метод, который принимает массив строк и возвращает строку с максимальной длиной.
     */
    public static String getLongestString(String[] array) {
        String maxLength = "";
        int countMax = 0;
        for (String s : array){
            int count = 0;
            for (char c : s.toCharArray()) count++;
            if (count > countMax) {
                countMax = count;
                maxLength = s;
            }
        }
        return maxLength;
    }

    /**
     * 8. Напишите метод, который принимает массив строк и возвращает true, если массив содержит заданную строку.
     */
    public static boolean containsString(String[] array, String target) {
        for (String s: array) {
            if (s.equals(target)) return true;
        }
        return false;
    }

    /**
     * 9. Напишите метод, который принимает массив строк и возвращает количество строк, которые начинаются с заданной буквы.
     */
    public static int countStringsStartingWith(String[] array, char letter) {
        int count = 0;
        for (String s : array){
            if (s.charAt(0) == letter) count++;
        }
        return count;
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк в верхнем регистре.
     */
    public static String[] convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"apple", "banana", "cherry", "coconut"};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("getArrayLength(array) = " + getArrayLength(array));
        printArray(array);
        System.out.println("getFirstElement(array) = " + getFirstElement(array));
        System.out.println("getLastElement(array) = " + getLastElement(array));
        System.out.println("reverseArray(array) = " + Arrays.toString(reverseArray(array)));
        System.out.println("getLongestStringLength(array) = " + getLongestStringLength(array));
        System.out.println("getLongestString(array}) = " + getLongestString(array));
        System.out.println("containsString(array, \"banana\") = " + containsString(array, "banana"));
        System.out.println("countStringsStartingWith(array,'c') = " + countStringsStartingWith(array, 'c'));
        System.out.println("convertToUpperCase(array) = " + Arrays.toString(convertToUpperCase(array)));
    }
}

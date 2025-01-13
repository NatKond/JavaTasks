package org.tel.ran.Tasks._19_12_2024;

import java.util.Arrays;

public class T11 {

    /**
     * 1. Напишите метод, который принимает массив логических значений и возвращает количество значений true.
     */
    public static int countTrue(boolean[] array) {
        int count = 0;
        for (boolean b : array) {
            if (b) count++;
        }
        return count;
    }

    /**
     * 2. Напишите метод, который принимает массив логических значений и возвращает true, если все элементы равны true.
     */
    public static boolean areAllTrue(boolean[] array) {
        for (boolean b: array){
            if (!b) return false;
        }
        return true;
    }

    /**
     * 3. Напишите метод, который принимает массив логических значений и возвращает true, если хотя бы один элемент равен true.
     */
    public static boolean containsTrue(boolean[] array) {
        for (boolean b: array){
            if (b) return true;
        }
        return false;
    }

    /**
     * 4. Напишите метод, который принимает массив логических значений и возвращает массив с противоположными значениями.
     */
    public static boolean[] invertArray(boolean[] array) {
        boolean[] arrayCopy = new boolean[array.length];
        for (int i = 0; i < array.length; i++){
            arrayCopy[i] = !array[i];
        }
        return arrayCopy;
    }

    /**
     * 5. Напишите метод, который принимает массив логических значений и возвращает количество значений false.
     */
    public static int countFalse(boolean[] array) {
        int count = 0;
        for (boolean b : array) {
            if (!b) count++;
        }
        return count;
    }

    /**
     * 6. Напишите метод, который принимает два массива логических значений и возвращает их логическое И (AND) поэлементно.
     */
    public static boolean[] andArrays(boolean[] array1, boolean[] array2) {
        boolean[] arrayAND = new boolean[Math.min(array1.length, array2.length)];
        for (int i = 0; i <arrayAND.length; i++) {
            arrayAND[i] = array1[i] && array2[i];
        }
        return arrayAND;
    }

    /**
     * 7. Напишите метод, который принимает два массива логических значений и возвращает их логическое ИЛИ (OR) поэлементно.
     */
    public static boolean[] orArrays(boolean[] array1, boolean[] array2) {
        boolean[] arrayOR = new boolean[Math.min(array1.length, array2.length)];
        for (int i = 0; i < arrayOR.length; i++) {
            arrayOR[i] = array1[i] || array2[i];
        }
        return arrayOR;
    }

    /**
     * 8. Напишите метод, который принимает массив логических значений и возвращает true, если количество значений true больше, чем false.
     */
    public static boolean moreTrueThanFalse(boolean[] array) {
        int countTrue = 0;
        int countFalse = 0;
        for (boolean b : array) {
            if (b) countTrue++;
            else countFalse++;
        }

        return countTrue > countFalse;
    }

    /**
     * 9. Напишите метод, который принимает массив логических значений и возвращает индекс первого значения true.
     */
    public static int firstTrueIndex(boolean[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i]) return i;
        }
        return -1;
    }

    /**
     * 10. Напишите метод, который принимает массив логических значений и возвращает true, если массив симметричен (палиндром).
     */
    public static boolean isSymmetric(boolean[] array) {
        if (array.length == 1) return true;
        else {
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - 1 - i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean[] exampleArray = {false, false, true, false, true, false, true};
        System.out.println("exampleArray = " + Arrays.toString(exampleArray));
        System.out.println("countTrue(exampleArray) = " + countTrue(exampleArray));
        System.out.println("areAllTrue(exampleArray) = " + areAllTrue(exampleArray));
        System.out.println("containsTrue(exampleArray) = " + containsTrue(exampleArray));
        System.out.println("invertArray(exampleArray) = " + Arrays.toString(invertArray(exampleArray)));
        System.out.println("countFalse(exampleArray) = " + countFalse(exampleArray));
        System.out.println("andArrays(new boolean[]{true, false, true, false}, new boolean[]{true, true, true, true, true}) = " + Arrays.toString(andArrays(new boolean[]{true, false, true, false}, new boolean[]{true, true, true, true, true})));
        System.out.println("orArrays(new boolean[]{true, false, true, false}, new boolean[]{true, true, true, false, true}) = " + Arrays.toString(orArrays(new boolean[]{true, false, true, false}, new boolean[]{true, true, true, false, true})));
        System.out.println("moreTrueThanFalse(exampleArray) = " + moreTrueThanFalse(exampleArray));
        System.out.println("firstTrueIndex(exampleArray) = " + firstTrueIndex(exampleArray));
        System.out.println("isSymmetric(exampleArray) = " + isSymmetric(exampleArray));
    }
}
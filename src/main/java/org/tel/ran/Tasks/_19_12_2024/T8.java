package org.tel.ran.Tasks._19_12_2024;

import java.util.Arrays;

public class T8 {
    /**
     * 1. Напишите метод, который принимает массив символов и возвращает его длину.
     */
    public static int getArrayLength(char[] array) {
        return array.length;
    }

    /**
     * 2. Напишите метод, который принимает массив символов и выводит его элементы в консоль.
     */
    public static void printArray(char[] array) {
        System.out.println("array = " + Arrays.toString(array));
    }

    /**
     * 3. Напишите метод, который принимает массив символов и возвращает первый символ.
     */
    public static char getFirstElement(char[] array) {
        return array[0];
    }

    /**
     * 4. Напишите метод, который принимает массив символов и возвращает последний символ.
     */
    public static char getLastElement(char[] array) {
        return array[array.length - 1];
    }

    /**
     * 5. Напишите метод, который принимает массив символов и возвращает массив в обратном порядке.
     */
    public static char[] reverseArray(char[] array) {
        String reversedString = new StringBuilder(new String(array)).reverse().toString();
        /*
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - 1 - i] = array[i];
        }*/
        return reversedString.toCharArray();
    }

    /**
     * 6. Напишите метод, который принимает массив символов и возвращает количество гласных букв в массиве.
     */
    public static int countVowels(char[] array) {
        String vowels = "aeiou";
        int countVowels = 0;
        for (int i = 0; i < array.length; i++) {
            if (vowels.indexOf(array[i]) != -1){
                countVowels++;
            }
        }
        return countVowels;
    }

    /**
     * 7. Напишите метод, который принимает массив символов и заменяет все буквы на заглавные.
     */
    public static char[] toUpperCase(char[] array) {
        String arrayString = new String(array);
        arrayString = arrayString.toUpperCase();
        return arrayString.toCharArray();
    }

    /**
     * 8. Напишите метод, который принимает массив символов и проверяет, является ли он палиндромом.
     */
    public static boolean isPalindrome(char[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 9. Напишите метод, который принимает массив символов и возвращает количество пробелов в массиве.
     */
    public static int countSpaces(char[] array) {
        int countSpaces = 0;
        for (char c: array){
            if (c == ' '){
                countSpaces++;
            }
        }
        return countSpaces;
    }

    /**
     * 10. Напишите метод, который принимает массив символов и заменяет все цифры на символ '*'.
     */
    public static char[] replaceDigitsWithAsterisk(char[] array) {
        char[] withoutNumbers = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 47 && array[i] < 58){
                withoutNumbers[i] = '*';
            }else {
                withoutNumbers[i] = array[i];
            }
        }
        return withoutNumbers;
    }

    public static void main(String[] args) {
        char[] exampleArray = {'a', 'b', 'c', '1', '2', ' ', 'e', '9'};
        System.out.println("exampleArray = " + Arrays.toString(exampleArray));
        System.out.println("getArrayLength(exampleArray) = " + getArrayLength(exampleArray));
        printArray(exampleArray);
        System.out.println("getFirstElement(exampleArray) = " + getFirstElement(exampleArray));
        System.out.println("getLastElement(exampleArray) = " + getLastElement(exampleArray));
        System.out.println("reverseArray(exampleArray) = " + Arrays.toString(reverseArray(exampleArray)));
        System.out.println("countVowels(exampleArray) = " + countVowels(exampleArray));
        System.out.println("toUpperCase(exampleArray) = " + Arrays.toString(toUpperCase(exampleArray)));
        System.out.println("isPalindrome(exampleArray) = " + isPalindrome(exampleArray));
        System.out.println("countSpaces(exampleArray) = " + countSpaces(exampleArray));
        System.out.println("replaceDigitsWithAsterisk() = " + Arrays.toString(replaceDigitsWithAsterisk(exampleArray)));
    }
}

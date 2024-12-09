package org.tel.ran.Tasks._05_12_2024.taski2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTasksWithStringsAndInts {

    // 21. Генерация нового массива из четных чисел.
    public static void task21() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("array = " + Arrays.toString(array));
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                countEven++;
            }
        }
        int[] arrayEven = new int[countEven];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0){
                arrayEven[k] = array[i];
                k++;
            }
        }
        System.out.println("arrayEven = " + Arrays.toString(arrayEven));
    }

    // 22. Генерация нового массива из нечетных чисел.
    public static void task22() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("array = " + Arrays.toString(array));
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0) {
                countOdd++;
            }
        }
        int[] arrayOdd = new int[countOdd];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0){
                arrayOdd[k] = array[i];
                k++;
            }
        }
        System.out.println("arrayOdd = " + Arrays.toString(arrayOdd));
    }

    // 23. Проверка на палиндром в массиве строк.
    public static void task23() {
        String[] array = {"level", "hello", "radar", "world", "tenet", "kiwi", "redder"};
        System.out.println("array = " + Arrays.toString(array));
        boolean isPalindrome = true;
        for (int i = 0; i < array.length; i++) {
            isPalindrome = true;
            for (int j = 0; j < array[i].length()/2; j++) {
                if (array[i].charAt(j) != array[i].charAt(array[i].length() - 1 - j)){
                    isPalindrome = false;
                }
            }
            if (isPalindrome) {
                System.out.println("array[" + i + "] = " + array[i] + " is palindrome.");
            }
        }
    }

    // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
    public static void task24() {
        String[] array = {"apple", "application", "banana", "grape"};
        String pattern = "app";
        System.out.println("array = " + Arrays.toString(array) + ", pattern = " + pattern);
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(pattern)) {
                System.out.println("array[" + i + "] = " + array[i] + " contains " + pattern);
            }
        }
    }

    // 25. Создание массива чисел с четными индексами.
    public static void task25() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("array = " + Arrays.toString(array));
        int arrayEvenIndexesLength = array.length/2;
        if (array.length % 2 == 1){
            arrayEvenIndexesLength++;
        }

        int[] arrayEvenIndexes = new int[arrayEvenIndexesLength];
        for (int i = 0; i < array.length; i+=2) {
            arrayEvenIndexes[i/2] = array[i];
        }
        System.out.println("arrayEvenIndexes = " + Arrays.toString(arrayEvenIndexes));
    }

    // 26. Создание массива чисел с нечетными индексами.
    public static void task26() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("array = " + Arrays.toString(array));

        int[] arrayOddIndexes = new int[array.length/2];
        for (int i = 1; i < array.length; i+=2) {
            arrayOddIndexes[(i-1)/2] = array[i];
        }
        System.out.println("arrayOddIndexes = " + Arrays.toString(arrayOddIndexes));

    }

    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
    public static void task27() {
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
        System.out.println("array = " + Arrays.toString(array));

        //Первый вариант решения без использования ArrayList
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length()%2 == 0) {
                countEven++;
            }else {
                countOdd++;
            }
        }

        String[] arrayEvenLength = new String[countEven];
        String[] arrayOddLength = new String[countOdd];
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length()%2 == 0) {
                arrayEvenLength[j] = array[i];
                j++;
            }else {
                arrayOddLength[k] = array[i];
                k++;
            }
        }
        System.out.println("arrayEvenLength = " + Arrays.toString(arrayEvenLength));
        System.out.println("arrayOddLength = " + Arrays.toString(arrayOddLength));

        //Второй вариант решения с ArrayList
        ArrayList<String> listEvenLength = new ArrayList<>();
        ArrayList<String> listOddLength = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length()%2 == 0) {
                listEvenLength.add(array[i]);
            }else {
                listOddLength.add(array[i]);
            }
        }
        System.out.println("listEvenLength = " + listEvenLength);
        System.out.println("listOddLength = " + listOddLength);
    }

    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
    public static void task28() {
        String[] array = {"apple", "banana", "level", "radar", "hello"};
        System.out.println("array = " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == array[i].charAt(array[i].length() - 1)) {
                System.out.println("array[" + i + "] = " + array[i] + " starts and ends with the same letter");
            }
        }
    }

    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
    public static void task29() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array = " + Arrays.toString(array));
        int[] arrayOfSquares = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOfSquares[i] = array[i] * array [i];
        }
        System.out.println("arrayOfSquares = " + Arrays.toString(arrayOfSquares));
    }

    // 30. Создать массив строк, содержащих только уникальные символы.
    public static void task30() {
        String[] array = {"apple", "banana", "cat", "dog", "race"};
        System.out.println("array = " + Arrays.toString(array));

        //Первый вариант решения без использования ArrayList
        String allWords = array[0];

        for (int i = 1; i < array.length; i++) {
                allWords += array[i];
        }

        System.out.println("allWords = " + allWords);

        boolean isUnique = true;
        int countUniqueLetters = 0;
        for (int i = 0; i < allWords.length(); i++) {
            for (int j = 1; i >= j; j++) {
                if (allWords.charAt(i) == allWords.charAt(i-j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                countUniqueLetters++;
            }
            isUnique = true;
        }

        String[] arrayUniqueLetters = new String[countUniqueLetters];
        int k = 0;
        for (int i = 0; i < allWords.length(); i++) {
            isUnique = true;
            for (int j = 1; i >= j; j++) {
                if (allWords.charAt(i) == allWords.charAt(i-j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                arrayUniqueLetters[k] = String.valueOf(allWords.charAt(i));
                k++;
            }
        }
        System.out.println("arrayUniqueLetters = " + Arrays.toString(arrayUniqueLetters));

        //Второй вариант решения с ArrayList
        ArrayList<String> listUniqueLetters = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                isUnique = true;
                for (int l = 0; l < listUniqueLetters.size(); l++) {
                    if (array[i].charAt(j) == listUniqueLetters.get(l).charAt(0)) {
                        isUnique = false;
                    }
                }
                if (isUnique) {
                    listUniqueLetters.add(String.valueOf(array[i].charAt(j)));
                }
            }
        }
        System.out.println("listFirstLetters = " + listUniqueLetters);

    }
}
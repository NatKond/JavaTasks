package org.tel.ran.Tasks._05_12_2024.taski2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTasksWithStringsAndIntsB {

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "dog", "ox", "deer"};
        System.out.println("array = " + Arrays.toString(array));
        boolean isOrdered = false;
        int numberOfIterations = 0;
        while (!isOrdered) {
            isOrdered = true;
            numberOfIterations++;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].length() > array[i + 1].length()) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isOrdered = false;
                }
            }
        }

        System.out.println("array = " + Arrays.toString(array));
        System.out.println("numberOfIterations = " + numberOfIterations);
    }


    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat" , "ox", "kiwi", "mango", "bat"};
        System.out.println("array = " + Arrays.toString(array));

        int lenghtMax = array[0].length();
        int lenghtMin = array[0].length();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < lenghtMin) {
                lenghtMin = array[i].length();
            }
            if (array[i].length() > lenghtMax) {
                lenghtMax = array[i].length();
            }
        }

        for (int i = lenghtMin; i <= lenghtMax; i++) {
            ArrayList <String> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                if (array[j].length() == i) {
                    list.add(array[j]);
                }
            }
            if (list.size() >= 2) {
                System.out.print("All words in array with a length of " + i + " characters: ");
                System.out.println(list);
            }
        }
    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println("array1 = " + Arrays.toString(array1) + ", array2 = " + Arrays.toString(array2));

        //boolean result = Arrays.equals(array1,array2);

        boolean result = true;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    result = false;
                }
            }
        }else{
            result = false;
        }
        System.out.println("Are array1 and array2 equal?  " + result);
    }

    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println("array1 = " + Arrays.toString(array1) + ", array2 = " + Arrays.toString(array2));
        int[] arraySum = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arraySum[i] = array1[i] + array2[i];
        }

        System.out.println("arraySum = " + Arrays.toString(arraySum));
    }

    // 15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
        System.out.println("array = " + Arrays.toString(array));
        //Первый вариант решения без использования ArrayList
        boolean isUnique = true;
        int countUnique = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i].equals(array[j])){
                    isUnique =false;
                    break;
                }
            }
            if (isUnique) {
                countUnique++;
            }
            isUnique = true;
        }

        String[] arrayOfUniques = new String[countUnique];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i !=j && array[i].equals(array[j])){
                isUnique = false;
                break;
                }
            }
            if (isUnique) {
                arrayOfUniques[k]=array[i];
                k++;
            }
        }
        System.out.println("arrayOfUniques = " + Arrays.toString(arrayOfUniques));

        //Второй вариант решения с ArrayList
        ArrayList<String> listOfUniques = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i].equals(array[j])){
                    isUnique =false;
                    break;
                }
            }
            if (isUnique) {
                listOfUniques.add(array[i]);
            }
        }
        System.out.println("listOfUniques = " + listOfUniques);
    }

    // 16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
        System.out.println("array = " + Arrays.toString(array));

        //Первый вариант решения без использования ArrayList
        boolean isUnique = true;
        int countUnique = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i].equals(array[j])){
                    isUnique =false;
                    break;
                }
            }
            if (isUnique) {
                countUnique++;
            }
            isUnique = true;
        }
        String[] arrayWithoutDublicates = new String[countUnique];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            isUnique = true;
            for (int j = i - 1; j >= 0; j--) {
                if (array[i].equals(array[j])){
                    isUnique =false;
                    break;
                }
            }
            if (isUnique) {
            arrayWithoutDublicates[k] = array[i];
            k++;
            }
        }
        System.out.println("arrayWithoutDublicates = " + Arrays.toString(arrayWithoutDublicates));

        //Второй вариант решения с ArrayList
        ArrayList<String> listWithoutDublicates = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            isUnique = true;
            for (int j = 0; j < listWithoutDublicates.size(); j++) {
                if (array[i].equals(listWithoutDublicates.get(j))){
                    isUnique =false;
                    break;
                }
            }
            if (isUnique) {
                listWithoutDublicates.add(array[i]);
            }

        }
        System.out.println("listWithoutDublicates = " + listWithoutDublicates);
    }

    // 17. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana", "kiwi"};
        String[] array2 = {"cherry", "mango", "apple"};

        System.out.println("array1 = " + Arrays.toString(array1) + ", array2 = " + Arrays.toString(array2));

        String[] arrayCombined = new String[array1.length + array2.length];
        /* Первый вариант решения с двумя циклами
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            arrayCombined[j] = array1[i];
            j++;
        }

        for (int i = 0; i < array2.length; i++) {
            arrayCombined[j] = array2[i];
            j++;
        }
        */
        //Второй вариант решения, где все присваивания осуществляются внутри одного цикла
        if (array1.length > array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (i < array2.length) {
                    arrayCombined[i] = array1[i];
                    arrayCombined[array1.length + i] = array2[i];
                } else {
                    arrayCombined[i] = array1[i];
                }
            }
        } else {
            for (int i = 0; i < array2.length; i++) {
                if (i < array1.length) {
                    arrayCombined[i] = array1[i];
                    arrayCombined[array1.length + i] = array2[i];
                } else {
                    arrayCombined[array1.length + i] = array2[i];
                }
            }
        }
        System.out.println("arrayCombined = " + Arrays.toString(arrayCombined));
    }

        // 18. Проверить, упорядочен ли массив строк по алфавиту.
        public static void task18 () {
            String[] array = {"apple", "banana", "cherry", "date", "fig"};
            System.out.println("array = " + Arrays.toString(array));
            boolean isAlphabeticallyOrdered = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].charAt(0) > array[i + 1].charAt(0)){
                    isAlphabeticallyOrdered = false;
                }
            }
            System.out.println("isAlphabeticallyOrdered = " + isAlphabeticallyOrdered);
        }

        // 19. Найти строки, начинающиеся с заданной буквы.
        public static void task19 () {
            String[] array = {"apple", "banana", "apricot", "cherry"};
            char target = 'a';
            System.out.println("array = " + Arrays.toString(array) + ", target = " + target);
            //Первый вариант решения без использования ArrayList
            int countWordsStartingWithTarget = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].charAt(0) == target){
                    countWordsStartingWithTarget++;
                }
            }

            String[] arrayStartsWithTarget = new String[countWordsStartingWithTarget];
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].charAt(0) == target){
                    arrayStartsWithTarget[k] = array[i];
                    k++;
                }
            }
            System.out.println("arrayStartsWithTarget = " + Arrays.toString(arrayStartsWithTarget));

            //Второй вариант решения с ArrayList
            ArrayList<String> listStartsWithTarget = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i].charAt(0) == target){
                    listStartsWithTarget.add(array[i]);
                }
            }
            System.out.println("listStartsWithTarget = " + listStartsWithTarget);
        }

        // 20. Создать массив строк из первых букв элементов другого массива.
        public static void task20 () {
            String[] array = {"apple", "banana", "cherry"};
            System.out.println("array = " + Arrays.toString(array));

            String[] arrayFirstLetters = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayFirstLetters[i] = String.valueOf(array[i].charAt(0));
            }
            System.out.println("arrayFirstLetters = " + Arrays.toString(arrayFirstLetters));
        }
}

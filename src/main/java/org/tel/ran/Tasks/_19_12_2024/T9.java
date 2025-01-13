package org.tel.ran.Tasks._19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;

public class T9 {
    /**
     * 1. Напишите метод, который принимает массив символов и возвращает массив уникальных символов.
     */
    public static char[] getUniqueCharacters(char[] array) {
        ArrayList <Character> uniqueCharactersList = new ArrayList<Character>();
        for (char c: array) {
            if (!uniqueCharactersList.contains(c)){
                uniqueCharactersList.add(c);
            }
        }

        char[] uniqueCharacters = new char[uniqueCharactersList.size()];
        for (int i = 0; i < uniqueCharacters.length; i++) {
            uniqueCharacters[i] = uniqueCharactersList.get(i);
        }
        return uniqueCharacters;
    }

    /**
     * 2. Напишите метод, который принимает массив символов и возвращает количество согласных букв.
     */
    public static int countConsonants(char[] array) {
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int countConsonants = 0;
        for (int i = 0; i < array.length; i++) {
            if (consonants.indexOf(array[i]) != - 1){
                countConsonants++;
            }
        }
        return countConsonants;
    }

    /**
     * 3. Напишите метод, который принимает массив символов и возвращает массив символов без пробелов.
     */
    public static char[] removeSpaces(char[] array) {
        ArrayList<Character> withoutSpacesList = new ArrayList<>();
        for (char c: array){
            if (c != ' '){
                withoutSpacesList.add(c);
            }
        }
        char[] withoutSpaces = new char[withoutSpacesList.size()];
        for (int i = 0; i < withoutSpaces.length; i++) {
            withoutSpaces[i] = withoutSpacesList.get(i);
        }
        return withoutSpaces;
    }

    /**
     * 4. Напишите метод, который принимает массив символов и возвращает массив, содержащий только буквы.
     */
    public static char[] filterLetters(char[] array) {
        ArrayList <Character> onlyLettersList = new ArrayList<>();
        for (char c: array) {
            if ((c > 64 && c < 91) || (c > 97 && c <123)){
                onlyLettersList.add(c);
            }
        }
        char[] onlyLetters = new char[onlyLettersList.size()];
        for (int i = 0; i < onlyLetters.length; i++) {
            onlyLetters[i] = onlyLettersList.get(i);
        }
        return onlyLetters;
    }

    /**
     * 5. Напишите метод, который принимает массив символов и возвращает самое часто встречающееся значение.
     */
    public static char findMostFrequentChar(char[] array) {
        boolean[] isComparedArrayEl = new boolean[array.length];
        int countMax = 0;
        char mostFrequentElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (!isComparedArrayEl[i]) {
                int count = 0;
                for (int j = i + 1; j < array.length; j++) {
                    if (isComparedArrayEl[i]) continue;
                    if (array[i] == array[j]) {
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
        return mostFrequentElement;
    }

    /**
     * 6. Напишите метод, который принимает массив символов и возвращает массив, где каждый символ увеличен на 1 в ASCII-коде.
     */
    public static char[] shiftCharactersByOne(char[] array) {
        char[] arrayCopy = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = (char) (array[i] + 1);
        }
        return arrayCopy;
    }

    /**
     * 7. Напишите метод, который принимает два массива символов и возвращает их объединение в один массив.
     */
    public static char[] mergeCharArrays(char[] array1, char[] array2) {
        char[] combinedArray = new char[array1.length + array2.length];
        for (int i = 0; i < Math.max(array1.length,array2.length); i++) {
            if (i < array1.length) {
                combinedArray[i] = array1[i];
            }
            if (i < array2.length) {
                combinedArray[array1.length + i] = array2[i];
            }
        }
        return combinedArray;
    }

    /**
     * 8. Напишите метод, который принимает массив символов и возвращает true, если все символы являются буквами.
     */
    public static boolean areAllLetters(char[] array) {
        boolean areOnlyLetters = true;
        for (char c: array) {
            if ((c < 63) || (c > 90 && c < 97) || (c > 122)) {
                areOnlyLetters = false;
                break;
            }
        }
        return areOnlyLetters;
    }

    /**
     * 9. Напишите метод, который принимает массив символов и возвращает строку, составленную из символов массива.
     */
    public static String convertToString(char[] array) {
        return new String(array);
    }

    /**
     * 10. Напишите метод, который принимает массив символов и возвращает массив, в котором дубликаты заменены на символ '_'.
     */
    public static char[] replaceDuplicatesWithUnderscore(char[] array) {
        char[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayCopy.length; i++) {
            for (int j = i + 1; j < arrayCopy.length; j++) {
                if (arrayCopy[i] == arrayCopy[j]){
                    arrayCopy[j] = '_';
                }
            }
        }
        return arrayCopy;
    }

    public static void main(String[] args) {
        char[] exampleArray = {'a', 'b', 'c', 'a', ' ', 'd', '1', ' ', 'w'};
        System.out.println("exampleArray = " + Arrays.toString(exampleArray));
        System.out.println("getUniqueCharacters(exampleArray) = " + Arrays.toString(getUniqueCharacters(exampleArray)));
        System.out.println("countConsonants(exampleArray) = " + countConsonants(exampleArray));
        System.out.println("removeSpaces(exampleArray) = " + Arrays.toString(removeSpaces(exampleArray)));
        System.out.println("filterLetters(exampleArray) = " + Arrays.toString(filterLetters(exampleArray)));
        System.out.println("findMostFrequentChar(exampleArray) = " + findMostFrequentChar(exampleArray));
        System.out.println("shiftCharactersByOne(exampleArray) = " + Arrays.toString(shiftCharactersByOne(exampleArray)));
        System.out.println("mergeCharArrays(new char[] {'a', 'b', 'c', 'd'}, new char[]{'e', 'f', 'g', '1', '2'}) = " + Arrays.toString(mergeCharArrays(new char[]{'a', 'b', 'c', 'd'}, new char[]{'e', 'f', 'g', '1', '2'})));
        System.out.println("areAllLetters(exampleArray) = " + areAllLetters(exampleArray));
        System.out.println("convertToString(exampleArray) = " + convertToString(exampleArray));
        System.out.println("replaceDuplicatesWithUnderscore(exampleArray) = " + Arrays.toString(replaceDuplicatesWithUnderscore(exampleArray)));
    }

}

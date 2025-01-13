package org.tel.ran.Tasks._19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static org.tel.ran.Tasks._19_12_2024.T6.getLongestStringLength;

public class T7 {
    /**
     * 1. Напишите метод, который принимает массив строк и возвращает массив строк, отсортированный в лексикографическом порядке.
     */
    public static String[] sortArray(String[] array) {
        String[] arrayCopy = Arrays.copyOf(array, array.length);
        boolean isOrdered;
        do {
            isOrdered = true;
            for (int i = 0; i < arrayCopy.length - 1; i++) {
                boolean isSame = true;
                for (int j = 0; j < Math.min(arrayCopy[i].length(), arrayCopy[i + 1].length()); j++) {
                    if (arrayCopy[i].charAt(j) != arrayCopy[i + 1].charAt(j)) {
                        if (arrayCopy[i].charAt(j) > arrayCopy[i + 1].charAt(j)) {
                                String temp = arrayCopy[i];
                                arrayCopy[i] = arrayCopy [i + 1];
                                arrayCopy[i + 1] = temp;
                                isOrdered = false;
                        }
                        isSame = false;
                        break;
                    }
                }
                if (isSame && arrayCopy[i].length() > arrayCopy[i + 1].length()) {
                    String temp = arrayCopy[i];
                    arrayCopy[i] = arrayCopy [i + 1];
                    arrayCopy[i + 1] = temp;
                    isOrdered = false;
                }
            }
        } while (!isOrdered);
        return arrayCopy;
    }

    /**
     * 2. Напишите метод, который принимает массив строк и возвращает самую часто встречающуюся строку.
     */
    public static String findMostFrequentString(String[] array) {
        boolean[] isComparedArrayEl = new boolean[array.length];
        int countMax = 0;
        String mostFrequentElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (isComparedArrayEl[i]) continue;
            int count = 0;
                for (int j = i + 1; j < array.length; j++) {
                    if (isComparedArrayEl[i]) continue;
                    if (array[i].equals(array[j])) {
                        isComparedArrayEl[j] = true;
                        count++;
                    }
                }
                if (count > countMax) {
                    mostFrequentElement = array[i];
                    countMax = count;
                }
            isComparedArrayEl[i] = true;
        }
        return mostFrequentElement;
    }

    /**
     * 3. Напишите метод, который принимает массив строк и возвращает массив только уникальных строк.
     */
    public static String[] getUniqueStrings(String[] array) {
        ArrayList <String> uniqueStrings = new ArrayList<>();
        for (String s : array) {
            if (!uniqueStrings.contains(s)) {
                uniqueStrings.add(s);
            }
        }
        return uniqueStrings.toArray(new String[0]);
    }

    /**
     * 4. Напишите метод, который принимает два массива строк и возвращает массив строк, которые присутствуют в обоих массивах.
     */
    public static String[] findCommonStrings(String[] array1, String[] array2) {
        ArrayList <String> commonStrings = new ArrayList<>();
        boolean[] isCompared = new boolean[array2.length];
        for (String s1 : array1) {
            for (int i = 0; i < array2.length; i++) {
                if (isCompared[i]) continue;
                if (Objects.equals(s1, array2[i])) {
                    commonStrings.add(s1);
                    isCompared[i] = true;
                    break;
                }
            }
        }
        return commonStrings.toArray(new String[0]);
    }

    /**
     * 5. Напишите метод, который принимает массив строк и возвращает массив строк, которые являются палиндромами.
     */
    public static String[] findPalindromes(String[] array) {
    ArrayList <String> palindromes = new ArrayList<>();
        for (String s : array) {
            boolean isPalindrome = true;
            for (int i = 0; i < s.length()/2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) palindromes.add(s);
        }
        String[] palindromesArray = new String[palindromes.size()];
        for (int i = 0; i < palindromes.size(); i++) {
            palindromesArray[i] = palindromes.get(i);
        }
        return palindromesArray;
    }

    /**
     * 6. Напишите метод, который принимает массив строк и удаляет строки, содержащие заданное слово.
     */
    public static String[] removeStringsContainingWord(String[] array, String word) {
        ArrayList <String> arrayListWithoutWord = new ArrayList<>();
        for (String s: array) {
            if (!s.equals(word)){
                arrayListWithoutWord.add(s);
            }
        }
        return arrayListWithoutWord.toArray(new String[0]);
    }

    /**
     * 7. Напишите метод, который принимает массив строк и возвращает строку с наибольшим количеством гласных.
     */
    public static String findStringWithMostVowels(String[] array) {
        String vowels = "aeiou";
        String wordWithMostVowes = "";
        int countMax = 0;

        for (String s: array){
            int count = 0;
            for (char c: s.toCharArray()){
                if (vowels.indexOf(c) > -1) {
                    count++;
                }
            }
            if (count > countMax){
                countMax = count;
                wordWithMostVowes = s;
            }
        }
        return wordWithMostVowes;
    }

    /**
     * 8. Напишите метод, который принимает массив строк и возвращает массив строк, содержащих только буквы (без цифр или специальных символов).
     */
    public static String[] filterAlphabeticStrings(String[] array) {
        ArrayList <String> arrayListWithoutNumbers = new ArrayList<>();
        for (String s: array){
            boolean containsOnlyLetters = true;
            for (char c: s.toCharArray()) {
            if (!((c > 63 && c < 91)||(c > 96 && c < 123))){
                containsOnlyLetters = false;
                break;
                }
            }
            if (containsOnlyLetters){
                arrayListWithoutNumbers.add(s);
            }
        }
        return arrayListWithoutNumbers.toArray(new String[0]);
    }

    /**
     * 9. Напишите метод, который принимает массив строк и возвращает массив строк, где каждая строка перевернута (reverse).
     */
    public static String[] reverseEachString(String[] array) {
        String[] arrayReverse = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReverse[i] = new StringBuilder(array[i]).reverse().toString();

            /*StringBuilder reverse = new StringBuilder();
            for (int j = array[i].length() - 1; j > -1; j--) {
                reverse.append(array[i].charAt(j));
            }
            arrayCopy[i] = reverse.toString();*/
        }
        return arrayReverse;
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк, сгруппированных по их длине (каждая группа отдельный элемент массива).
     */
    public static String[][] groupStringsByLength(String[] array) {
        int[] wordCount = new int[getLongestStringLength(array) + 1];
        for (String s : array) {
            wordCount[s.length()]++;
        }
        int countArrays = 0;
        for (int j : wordCount) {
            if (j != 0) {
                countArrays++;
            }
        }

        String[][] stringsByLength = new String[countArrays][];
        int y = 0;
        for (int i = 0; i < wordCount.length; i++) {
            if (wordCount[i] == 0) continue;
            String[] stringsOneLength = new String[wordCount[i]];
            int z = 0;
            for (String s : array) {
                if (s.length() == i) {
                    stringsOneLength[z] = s;
                    z++;
                }
            }
            stringsByLength[y++] = stringsOneLength;
        }
        return stringsByLength;
    }

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "radar", "123", "level", "123", "bananas", "apples", "apricot", "456", "apple"};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("sortArray(array) = " + Arrays.toString(sortArray(array)));
        System.out.println("findMostFrequentString(array) = " + findMostFrequentString(array));
        System.out.println("getUniqueStrings(array) = " + Arrays.toString(getUniqueStrings(array)));
        System.out.println("findCommonStrings(array, {\"123\", \"radar\", \"apple\", \"apple\"}) = " + Arrays.toString(findCommonStrings(array, new String[]{"123", "radar", "apple", "apple"})));
        System.out.println("findPalindromes(array) = " + Arrays.toString(findPalindromes(array)));
        System.out.println("removeStringsContainingWord(array, \"123\") = " + Arrays.toString(removeStringsContainingWord(array, "123")));
        System.out.println("findStringWithMostVowels(array) = " + findStringWithMostVowels(array));
        System.out.println("filterAlphabeticStrings(array) = " + Arrays.toString(filterAlphabeticStrings(array)));
        System.out.println("reverseEachString(array) = " + Arrays.toString(reverseEachString(array)));
        System.out.println("groupStringsByLength(array) = " + Arrays.deepToString(groupStringsByLength(array)));
    }
}

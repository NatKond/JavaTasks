package org.tel.ran.Tasks._19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;

public class T12 {
    /**
     * 1. Напишите метод, который принимает массив целых чисел и массив строк, и возвращает их длины как массив из двух элементов.
     */
    public static int[] getArrayLengths(int[] intArray, String[] stringArray) {
        int countInt = 0;
        int countStr = 0;
        for (int i = 0; i < Math.max(intArray.length, stringArray.length); i++) {
            if (i < intArray.length) countInt++;
            if (i < stringArray.length) countStr ++;
        }
        return new int[]{countInt, countStr};
    }

    /**
     * 2. Напишите метод, который принимает массив строк и массив символов,
     * и возвращает массив строк, каждая из которых начинается с соответствующего символа.
     */
    public static String[] filterStringsByChar(String[] stringArray, char[] charArray) {
        ArrayList <String> stringsByCharsList = new ArrayList<>();
        for (char c: charArray) {
            for (String s: stringArray)
                if (c == s.charAt(0)) stringsByCharsList.add(s);
        }
        String[] stringsByChars = new String[stringsByCharsList.size()];
        for (int i = 0; i < stringsByChars.length; i++){
            stringsByChars[i] = stringsByCharsList.get(i);
        }
        return stringsByChars;
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и массив логических значений, и возвращает сумму всех чисел, соответствующих true в логическом массиве.
     */
    public static int sumMatchingTrue(int[] intArray, boolean[] booleanArray) {
        int sum = 0;
        for (int i = 0; i < Math.min(intArray.length, booleanArray.length); i++) {
            if (booleanArray[i]) {
                sum += intArray[i];
            }
        }
        return sum;
    }

    /**
     * 4. Напишите метод, который принимает массив строк и массив целых чисел, и возвращает строку с самой большой длиной, если она длиннее, чем соответствующее число.
     */
    public static String getLongestStringIfLonger(String[] stringArray, int[] intArray) {
        int maxLength = 0;
        int indexMaxLength = 0;
        for (int i = 0; i < Math.min(stringArray.length, intArray.length); i++) {
            if (stringArray[i].length() > intArray[i])
                if (stringArray[i].length() > maxLength){
                    maxLength = stringArray[i].length();
                    indexMaxLength = i;
                }
        }
        return stringArray[indexMaxLength];
    }

    /**
     * 5. Напишите метод, который принимает массив символов и массив целых чисел, и возвращает массив символов, дублированных на значение из целого массива.
     */
    public static char[] duplicateCharsByNumbers(char[] charArray, int[] intArray) {
        ArrayList <Character> duplicateCharsList = new ArrayList<>();
        for (char c: charArray) {
            for (int i: intArray){
                if ((c - '0') == i){
                    duplicateCharsList.add(c);
                }
            }
        }
        char[] duplicateChars = new char[duplicateCharsList.size()];
        for (int i = 0; i < duplicateChars.length; i++) {
            duplicateChars[i] = duplicateCharsList.get(i);
        }
        return duplicateChars;
    }

    /**
     * 6. Напишите метод, который принимает массив логических значений и массив строк, и возвращает массив строк, соответствующих true.
     */
    public static String[] getStringsMatchingTrue(boolean[] booleanArray, String[] stringArray) {
        ArrayList <String> stringsMatchingTrueList = new ArrayList<>();
        for (int i = 0; i < Math.min(booleanArray.length, stringArray.length); i++) {
            if (booleanArray[i]) stringsMatchingTrueList.add(stringArray[i]);
        }
        String[] stringsMatchingTrue = new String[stringsMatchingTrueList.size()];
        for (int i = 0; i < stringsMatchingTrue.length; i++) {
            stringsMatchingTrue[i] = stringsMatchingTrueList.get(i);
        }
        return stringsMatchingTrue;
    }

    /**
     * 7. Напишите метод, который принимает массив целых чисел и массив символов, и возвращает массив символов, соответствующих четным числам.
     */
    public static char[] getCharsForEvenNumbers(int[] intArray, char[] charArray) {
        ArrayList <Character> charsForEvenNumbersList = new ArrayList<>();
        for (int i = 0; i < Math.min(intArray.length, charArray.length); i++) {
            if (intArray[i] % 2 == 0){
                charsForEvenNumbersList.add(charArray[i]);
            }
        }

        char[] charsForEvenNumbers = new char[charsForEvenNumbersList.size()];
        for (int i = 0; i < charsForEvenNumbers.length; i++) {
            charsForEvenNumbers[i] = charsForEvenNumbersList.get(i);
        }
        return charsForEvenNumbers;
    }

    /**
     * 8. Напишите метод, который принимает два массива строк и возвращает массив строк, где каждый элемент — это конкатенация строк с одинаковыми индексами из обоих массивов.
     */
    public static String[] concatenateStringArrays(String[] array1, String[] array2) {
        String[] arrayCombined = new String[Math.min(array1.length, array2.length)];
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            arrayCombined[i] = array1[i] + array2[i];
        }
        return arrayCombined;
    }

    /**
     * 9. Напишите метод, который принимает массив целых чисел и массив логических значений, и возвращает true, если хотя бы одно число больше 10 и соответствует true.
     */
    public static boolean hasNumberGreaterThan10MatchingTrue(int[] intArray, boolean[] booleanArray) {
        for (int i = 0; i < Math.min(intArray.length, booleanArray.length); i++) {
            if (booleanArray[i] && intArray[i] > 10) return true;
        }
        return false;
    }

    /**
     * 10. Напишите метод, который принимает массив строк и массив символов, и возвращает массив строк, содержащих соответствующий символ.
     */
    public static String[] getStringsContainingChar(String[] stringArray, char[] charArray) {
        ArrayList <String> stringsContainingCharList = new ArrayList<>();
        for (int i = 0; i < Math.min(stringArray.length, charArray.length); i++) {
            if (stringArray[i].indexOf(charArray[i]) != -1) {
                stringsContainingCharList.add(stringArray[i]);
            }
        }
        String[] stringsContainingChar = new String[stringsContainingCharList.size()];
        for (int i = 0; i < stringsContainingChar.length; i++) {
            stringsContainingChar[i] = stringsContainingCharList.get(i);
        }
        return stringsContainingChar;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 11};
        char[] charArray = {'2','4','3','6'};
        String[] stringArray = {"one", "two", "three", "four", "five"};
        boolean[] booleanArray = {true, false, true, true, false, true};
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("stringArray = " + Arrays.toString(stringArray));
        System.out.println("booleanArray = " + Arrays.toString(booleanArray));
        System.out.println("charArray = " + Arrays.toString(charArray));
        System.out.println("getArrayLengths(intArray,stringArray) = " + Arrays.toString(getArrayLengths(intArray, stringArray)));
        System.out.println("filterStringsByChar(new String[]{\"banana\", \"apple\", \"coconut\", \"kiwi\", \"grape\"}, new char[]{'a', 'b', 'c', 'd', 'i', 'f', 'g'}) = " + Arrays.toString(filterStringsByChar(new String[]{"banana", "apple", "coconut", "kiwi", "grape"}, new char[]{'a', 'b', 'c', 'd', 'i', 'f', 'g'})));
        System.out.println("sumMatchingTrue(intArray, booleanArray) = " + sumMatchingTrue(intArray, booleanArray));
        System.out.println("getArrayLengths(intArray,stringArray) = " + getLongestStringIfLonger(stringArray, intArray));
        System.out.println("duplicateCharsByNumbers(charArray) = " + Arrays.toString(duplicateCharsByNumbers(charArray, intArray)));
        System.out.println("getStringsMatchingTrue(booleanArray,stringArray) = " + Arrays.toString(getStringsMatchingTrue(booleanArray, stringArray)));
        System.out.println("getCharsForEvenNumbers(intArray, charArray) = " + Arrays.toString(getCharsForEvenNumbers(intArray, charArray)));
        System.out.println("concatenateStringArrays(new String[]{\"James-\", \"Oscar-\", \"Charlie-\"}, new String[]{\"Tom\", \"Georg\", \"John\"}) = " + Arrays.toString(concatenateStringArrays(new String[]{"James-", "Oscar-", "Charlie-"}, new String[]{"Tom", "Georg", "John"})));
        System.out.println("hasNumberGreaterThan10MatchingTrue(intArray,booleanArray) = " + hasNumberGreaterThan10MatchingTrue(intArray, booleanArray));
        System.out.println("getStringsContainingChar(new String[]{\"banana\", \"apple\", \"coconut\", \"kiwi\", \"grape\"}, new char[]{'a', 'b', 'c', 'd', 'i', 'f', 'g'}) = " + Arrays.toString(getStringsContainingChar(new String[]{"banana", "apple", "coconut", "kiwi", "grape"}, new char[]{'a', 'b', 'c', 'd', 'i', 'f', 'g'})));
    }
}

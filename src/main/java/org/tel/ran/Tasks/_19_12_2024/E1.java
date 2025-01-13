package org.tel.ran.Tasks._19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;

import static org.tel.ran.Tasks._19_12_2024.T5.shuffleArray;

public class E1 {
    /**
     * 1. Напишите метод, который принимает два массива строк одинаковой длины и возвращает массив,
     * содержащий строки, составленные из соответствующих строк двух массивов в обратном порядке.
     */
    public static String[] combineStringsInReverseOrder(String[] array1, String[] array2) {
        String[] combinedStrings = new String[array1.length];
        for (int i = 0; i < combinedStrings.length; i++) {
            combinedStrings[i] = array1[combinedStrings.length - 1 - i] + array2[combinedStrings.length - 1 - i];
        }
        return combinedStrings;
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и массив строк,
     * и возвращает количество строк, чья длина больше, чем соответствующее число в массиве чисел.
     */
    public static int countStringsLongerThanNum(String[] strArray, int[] intArray) {
        int count = 0;
        for (int i = 0; i < Math.min(strArray.length, intArray.length); i++) {
            if (strArray[i].length() > intArray[i]) count++;
        }
        return count;
    }

    /**
     * 3. Напишите метод, который принимает массив символов и массив строк,
     * и возвращает массив, где строки содержат только символы из соответствующего элемента массива символов.
     */
    public static String[] findStringsConsistingOfChars(char[] charArray, String[] strArray) {
        ArrayList<String> stringsConsistingOfCharsList = new ArrayList<>();
        String stringOfCharArray = new String(charArray);
        for (String st : strArray) {
            boolean isConsistingOfChars = true;
            for (int i = 0; i < st.length(); i++) {
                if (stringOfCharArray.indexOf(st.charAt(i)) == -1) {
                    isConsistingOfChars = false;
                    break;
                }
            }
            if (isConsistingOfChars) stringsConsistingOfCharsList.add(st);
        }
        String[] stringsConsistingOfChars = new String[stringsConsistingOfCharsList.size()];
        for (int i = 0; i < stringsConsistingOfChars.length; i++) {
            stringsConsistingOfChars[i] = stringsConsistingOfCharsList.get(i);
        }
        return stringsConsistingOfChars;
    }

    /**
     * 4. Напишите метод, который принимает два массива целых чисел одинаковой длины
     * и возвращает массив, содержащий разность квадратов соответствующих чисел.
     */
    public static int[] calculateDifferenceOfSquares(int[] array1, int[] array2) {
        int[] differenceOfSquares = new int[array1.length];
        for (int i = 0; i < differenceOfSquares.length; i++) {
            differenceOfSquares[i] = array1[i] * array1[i] - array2[i] * array2[i];
        }
        return differenceOfSquares;
    }

    /**
     * 5. Напишите метод, который принимает массив логических значений и массив строк,
     * и возвращает массив строк, где каждое значение true добавляет "(valid)" к соответствующей строке.
     */
    public static String[] checkAccordingToArrayOfBooleans(String[] strArray, boolean[] booleanArray) {
        String[] newStrArray = new String[Math.min(strArray.length, booleanArray.length)];
        for (int i = 0; i < newStrArray.length; i++) {
            if (booleanArray[i]) {
                newStrArray[i] = strArray[i] + " valid";
            } else {
                newStrArray[i] = strArray[i];
            }
        }
        return newStrArray;
    }


    /**
     * 6. Напишите метод, который принимает два массива строк одинаковой длины
     * и возвращает массив строк, где каждая строка — это объединение строк из обоих массивов с добавлением их длин.
     */

    public static String[] combineStringsWithLength(String[] array1, String[] array2) {
        String[] combinedStrings = new String[array1.length];
        for (int i = 0; i < combinedStrings.length; i++) {
            combinedStrings[i] = array1[i] + array1[i].length() + array2[i] + array2[i].length();
        }
        return combinedStrings;
    }

    /**
     * 7. Напишите метод, который принимает массив чисел с плавающей точкой и массив целых чисел,
     * и возвращает массив, содержащий произведения соответствующих элементов.
     */
    public static double[] multiplyNumbers(double[] array1, int[] array2) {
        double[] result = new double[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        return result;
    }

    /**
     * 8. Напишите метод, который принимает два массива символов и возвращает массив символов,
     * которые присутствуют в обоих массивах.
     */
    public static char[] findCommonChars(char[] array1, char[] array2) {
        ArrayList<Character> commonCharsList = new ArrayList<>();
        String stringOfArray2 = new String(array2);
        for (char c : array1) {
            if (stringOfArray2.indexOf(c) != -1) {
                commonCharsList.add(c);
            }
        }
        char[] commonChars = new char[commonCharsList.size()];
        for (int i = 0; i < commonChars.length; i++) {
            commonChars[i] = commonCharsList.get(i);
        }
        return commonChars;
    }

    /**
     * 9. Напишите метод, который принимает массив строк и массив чисел,
     * и возвращает true, если все строки массива имеют длину, равную соответствующему числу.
     */
    public static boolean checkLength(String[] strArray, int[] intArray) {
        for (int i = 0; i < Math.min(strArray.length, intArray.length); i++) {
            if (strArray[i].length() != intArray[i]) return false;
        }
        return true;
    }

    /**
     * 10. Напишите метод, который принимает два массива строк и возвращает строку,
     * содержащую чередующиеся элементы из двух массивов.
     */
    public static String[] shuffleStrings(String[] array1, String[] array2) {
        String[] newStrings = new String[array1.length];
        for (int i = 0; i < newStrings.length; i++) {
            newStrings[i] = array1[i].substring(0, array1[i].length()/3) + array2[i].substring(array2[i].length()/3, 2*array2[i].length()/3) + array1[i].substring(2 * array1[i].length()/3);
        }
        return newStrings;
    }


    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "radar", "kiwi", "apricot", "apple"};
        String[] strArray2 = {"pear", "grapes", "pineapple", "cherry", "melon", "plum"};
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArray2 = shuffleArray(intArray);
        double[] doubleArray = {1, 2, 3, 4, 5, 6};
        char[] charArray = {'a', 'p', 'l', 'e', 'r', 'd', 'i', 'c', 't', 'o'};
        char[] charArray2 = {'a', 'r', 'd', 'i', 'l', 'b'};
        boolean[] booleanArray = {true, true, false, true, false, false};
        System.out.println("strArray = " + Arrays.toString(strArray));
        System.out.println("strArray2 = " + Arrays.toString(strArray2));
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("intArray2 = " + Arrays.toString(intArray2));
        System.out.println("charArray = " + Arrays.toString(charArray));
        System.out.println("charArray2 = " + Arrays.toString(charArray2));

        System.out.println("combineStringsInReverseOrder(charArray, strArray) = " + Arrays.toString(combineStringsInReverseOrder(strArray, strArray2)));
        System.out.println("countStringsLongerThanNum(strArray1,intArray) = " + countStringsLongerThanNum(strArray, intArray));
        System.out.println("findStringsConsistingOfChars(charArray,strArray) = " + Arrays.toString(findStringsConsistingOfChars(charArray, strArray)));
        System.out.println("calculateDifferenceOfSquares(intArray,shuffleArray(intArray)) = " + Arrays.toString(calculateDifferenceOfSquares(intArray, intArray2)));
        System.out.println("checkAccordingToArrayOfBooleans(strArray,booleanArray) = " + Arrays.toString(checkAccordingToArrayOfBooleans(strArray, booleanArray)));
        System.out.println("combineStringsWithLength(strArray,strArray) = " + Arrays.toString(combineStringsWithLength(strArray, strArray)));
        System.out.println("multiplyNumbers(doubleArray,intArray) = " + Arrays.toString(multiplyNumbers(doubleArray, intArray)));
        System.out.println("findCommonChars(charArray,charArray2) = " + Arrays.toString(findCommonChars(charArray, charArray2)));
        System.out.println("checkLength(strArray,intArray) = " + checkLength(strArray, intArray));
        System.out.println("shuffleStrings(strArray,strArray2) = " + Arrays.toString(shuffleStrings(strArray, strArray2)));
    }
}
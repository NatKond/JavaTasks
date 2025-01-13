package org.tel.ran.Tasks._19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;

public class T13 {
    /**
     * 1. Напишите метод, который принимает массив целых чисел и массив строк,
     * и выводит элементы двух массивов построчно.
     */
    public static void printArrays(int[] intArray, String[] strArray) {
        for (int i = 0; i < Math.min(intArray.length,strArray.length); i++) {
            System.out.println(intArray[i] + " " + strArray[i]);
        }
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и массив строк,
     * и возвращает массив строк с добавлением соответствующего числа к каждой строке.
     */
    public static String[] appendNumbersToStrings(int[] intArray, String[] strArray) {
        String[] stringsWithNumbers = new String[Math.min(intArray.length, strArray.length)];
        for (int i = 0; i < stringsWithNumbers.length; i++) {
            stringsWithNumbers[i] = intArray[i] + strArray[i];
        }
        return stringsWithNumbers;
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и массив логических значений,
     * и возвращает количество true для чисел, больших 10.
     */
    public static int countTrueForLargeNumbers(int[] intArray, boolean[] boolArray) {
        int countTrue = 0;
        for (int i = 0; i < Math.min(intArray.length, boolArray.length); i++) {
            if (boolArray[i] && intArray[i] > 10) {
                countTrue++;
            }
        }
        return countTrue;
    }

    /**
     * 4. Напишите метод, который принимает массив строк и массив символов,
     * и возвращает массив строк, где к каждой строке добавлен соответствующий символ.
     */
    public static String[] concatenateStringAndChar(String[] strArray, char[] charArray) {
        String[] stringAndChars = new String[Math.min(strArray.length, charArray.length)];
        for (int i = 0; i < stringAndChars.length; i++) {
            stringAndChars[i] = strArray[i] + charArray[i];
        }
        return stringAndChars;
    }

    /**
     * 5. Напишите метод, который принимает массив строк и массив целых чисел,
     * и возвращает сумму длин всех строк, умноженных на соответствующее число.
     */
    public static int sumStringLengthsTimesNumbers(String[] strArray, int[] intArray) {
        int sum = 0;
        for (int i = 0; i < Math.min(strArray.length,intArray.length); i++) {
            sum += strArray[i].length() * intArray[i];
        }
        return sum;
    }

    /**
     * 6. Напишите метод, который принимает массив целых чисел и массив строк,
     * и возвращает true, если длина строки равна соответствующему числу.
     */
    public static boolean areStringLengthsEqualToNumbers(String[] strArray, int[] intArray) {
        boolean areEqual = true;
        for (int i = 0; i < Math.min(strArray.length, intArray.length); i++) {
            if (strArray[i].length() != intArray[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * 7. Напишите метод, который принимает массив символов и массив строк,
     * и возвращает количество строк, начинающихся с соответствующего символа.
     */
    public static int countStringsStartingWithChar(String[] strArray, char[] charArray) {
        int count = 0;
        for (int i = 0; i < Math.min(strArray.length, charArray.length); i++) {
            if (strArray[i].charAt(0) == charArray[i]) count++;
        }
        return count;
    }

    /**
     * 8. Напишите метод, который принимает массив целых чисел и массив логических значений,
     * и возвращает массив чисел, если соответствующее значение в логическом массиве равно true.
     */
    public static int[] filterNumbersByBoolean(int[] intArray, boolean[] boolArray) {
        ArrayList <Integer> numbersWithTrueList = new ArrayList<>();
        for (int i = 0; i < Math.min(intArray.length,boolArray.length); i++) {
            if (boolArray[i]) numbersWithTrueList.add(intArray[i]);
        }
        int[] numbersWithTrue = new int[numbersWithTrueList.size()];
        for (int i = 0; i < numbersWithTrue.length; i++) {
            numbersWithTrue[i] = numbersWithTrueList.get(i);
        }
        return numbersWithTrue;
    }

    /**
     * 9. Напишите метод, который принимает два массива строк,
     * и возвращает массив, содержащий строки из первого массива, которых нет во втором.
     */
    public static String[] findUniqueStrings(String[] array1, String[] array2) {
        ArrayList <String> uniqueStringsList = new ArrayList<>();

        for (String st1: array1){
            boolean isUnique = true;
            for (String st2: array2){
                if (st1.equals(st2)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) uniqueStringsList.add(st1);
        }

        String[] uniqueStrings = new String[uniqueStringsList.size()];
        for (int i = 0; i < uniqueStrings.length; i++) {
            uniqueStrings[i] = uniqueStringsList.get(i);
        }
        return uniqueStrings;
    }

    /**
     * 10. Напишите метод, который принимает массив целых чисел и массив строк,
     * и возвращает строку, составленную из строк, повторенных число раз, равное соответствующему числу.
     */
    public static String repeatStringsByNumbers(String[] strArray, int[] intArray) {
        String repeatStrings = "";
        for (int i = 0; i < Math.min(strArray.length, intArray.length); i++) {
            for (int j = 1; j <= intArray[i]; j++) {
                repeatStrings += strArray[i];
            }
        }
        return repeatStrings;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 3, 5, 7, 11};
        String[] strArray = {"a", "b", "c", "d", "i"};
        char[] charArray = {'a', 'b', 'c', 'd', 'i'};
        boolean[] booleanArray = {true, true, false, false, true};
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("strArray = " + Arrays.toString(strArray));
        System.out.println("booleanArray = " + Arrays.toString(booleanArray));
        printArrays(intArray,strArray);
        System.out.println(Arrays.toString(appendNumbersToStrings(intArray, strArray)));
        System.out.println("countTrueForLargeNumbers(intArray, booleanArray) = " + countTrueForLargeNumbers(intArray, booleanArray));
        System.out.println("concatenateStringAndChar(strArray,charArray) = " + Arrays.toString(concatenateStringAndChar(strArray, charArray)));
        System.out.println("sumStringLengthsTimesNumbers(strArray,intArray) = " + sumStringLengthsTimesNumbers(strArray, intArray));
        System.out.println("areStringLengthsEqualToNumbers(strArray, new int[]{1, 1, 1, 1, 1}) = " + areStringLengthsEqualToNumbers(strArray, new int[]{1, 1, 1, 1, 1}));
        System.out.println("countStringsStartingWithChar(strArray,charArray) = " + countStringsStartingWithChar(strArray, charArray));
        System.out.println("filterNumbersByBoolean(intArray, booleanArray) = " + Arrays.toString(filterNumbersByBoolean(intArray, booleanArray)));
        System.out.println("findUniqueStrings(strArray, new String[] {\"a\", \"c\", \"i\"}) = " + Arrays.toString(findUniqueStrings(strArray, new String[]{"a", "c", "i"})));
        System.out.println("repeatStringsByNumbers(strArray,intArray) = " + repeatStringsByNumbers(strArray, intArray));
    }
}

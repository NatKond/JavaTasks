package org.tel.ran.Tasks._19_12_2024;

import java.util.Arrays;

public class T2 {
    /**
     * 11. Напишите метод, который принимает массив чисел и возвращает их сумму.
     */
    public static int sumArray(int[] numbers) {
        int sum = numbers[0];
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    /**
     * 12. Напишите метод, который принимает два числа и возводит первое в степень второго.
     */
    public static double power(int base, int exponent) {
        return Math.pow(base,exponent);
    }

    /**
     * 13. Напишите метод, который проверяет, является ли число простым.
     */
    public static boolean isPrime(int number) {
        int count = 0;
        if (number <= 1)
            return false;
        for (int i = 2; i <= number; i++) {
            if (number%i == 0) {
                count++;
            }
            if (count > 1)
                return false;
        }
        return true;
    }

    /**
     * 14. Напишите метод, который принимает два числа и возвращает их наибольший общий делитель (НОД).
     */
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) return 0;
        int gcd = Math.min(a,b);
        while (gcd > 0){
            if (a % gcd == 0 && b % gcd ==0){
                return gcd;
            }
            gcd--;
        }
        return gcd;
    }

    /**
     * 15. Напишите метод, который принимает массив чисел и возвращает его максимальный элемент.
     */
    public static int maxInArray(int[] numbers) {
        int max = numbers[0];
        for (int number: numbers){
            if (number > max) max = number;
        }
        return max;
    }

    /**
     * 16. Напишите метод, который принимает массив чисел и возвращает его минимальный элемент.
     */
    public static int minInArray(int[] numbers) {
        int min = numbers[0];
        for (int number: numbers){
            if (number < min) min = number;
        }
        return min;
    }

    /**
     * 17. Напишите метод, который проверяет, является ли число палиндромом
     * (одинаково читается слева направо и справа налево).
     */
    public static boolean isPalindrome(int number) {
        String stingNumber = String.valueOf(number);
        if (stingNumber.length() == 1) return true;
        else {
            for (int i = 0; i < stingNumber.length()/2; i++) {
                if (stingNumber.charAt(i) != stingNumber.charAt(stingNumber.length() - i - 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 18. Напишите метод, который возвращает n-ое число Фибоначчи.
     */
    public static int fibonacci(int n) {
        int[] fibonacciNumbers = {0, 1 , 1};
        if (n == 0 || n == 1 || n == 2) return fibonacciNumbers[n];
        else {
            for (int i = 2; i < n; i++) {
                fibonacciNumbers[0] = fibonacciNumbers[1];
                fibonacciNumbers[1] = fibonacciNumbers[2];
                fibonacciNumbers[2] = fibonacciNumbers[0] + fibonacciNumbers[1];
            }
            return fibonacciNumbers[2];
        }
    }

    /**
     * 19. Напишите метод, который принимает массив чисел и сортирует его по возрастанию.
     */
    public static int[] sortArray(int[] numbers) {
        //Arrays.sort(numbers);
        boolean isArrayOrdered = false;
        while (!isArrayOrdered){
            isArrayOrdered = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers [i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers [i + 1];
                    numbers[i + 1] = temp;
                    isArrayOrdered = false;
                }
            }
        }
        return numbers;
    }

    /**
     * 20. Напишите метод, который принимает два числа и возвращает их наименьшее общее кратное (НОК).
     */
    public static int lcm(int a, int b) {
        for (int i = Math.max(a,b); i < a * b; i++) {
            if (i % a == 0 && i % b == 0) return i;
        }
        return a * b;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 1, 4, 5, 6};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("sumArray(array) = " + sumArray(array));
        System.out.println("power(5,2) = " + power(5, 2));
        System.out.println("isPrime(11) = " + isPrime(11));
        System.out.println("gcd(36,60) = " + gcd(36, 60));
        System.out.println("maxInArray(array) = " + maxInArray(array));
        System.out.println("minInArray(array) = " + minInArray(array));
        System.out.println("isPalindrome(6886) = " + isPalindrome(6886));
        System.out.println("fibonacci(8) = " + fibonacci(8));
        System.out.println("sortArray(array) = " + Arrays.toString(sortArray(array)));
        System.out.println("lcm(15,25) = " + lcm(15, 25));
    }
}

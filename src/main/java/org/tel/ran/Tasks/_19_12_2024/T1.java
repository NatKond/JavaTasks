package org.tel.ran.Tasks._19_12_2024;

public class T1 {
    /**
     * 1. Напишите метод, который принимает два целых числа и возвращает их сумму.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 2. Напишите метод, который принимает два числа и возвращает их разность.
     */
    public static int subtract(int a, int b) {
        return Math.abs(a-b);
    }

    /**
     * 3. Напишите метод, который принимает два числа и возвращает их произведение.
     */
    public static int multiply(int a, int b) {
        return a*b;
    }

    /**
     * 4. Напишите метод, который принимает два числа и возвращает их частное.
     */
    public static double divide(int a, int b) {
        double div = 0;
        if ( a == 0 || b == 0) return 0.0;
        else return a/(double)b;
    }

    /**
     * 5. Напишите метод, который принимает число и возвращает его квадрат.
     */
    public static int square(int a) {
        return a * a;
    }

    /**
     * 6. Напишите метод, который принимает три числа и возвращает их среднее арифметическое.
     */
    public static double average(int a, int b, int c) {
        return (a + b + c)/3.0;
    }

    /**
     * 7. Напишите метод, который принимает два числа и возвращает остаток от их деления.
     */
    public static int modulus(int a, int b) {
        return a % b;
    }

    /**
     * 8. Напишите метод, который принимает два числа и возвращает большее из них.
     */
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * 9. Напишите метод, который принимает два числа и возвращает меньшее из них.
     */
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    /**
     * 10. Напишите метод, который принимает число и проверяет, является ли оно четным.
     * Возвращает true, если число четное, и false, если нечетное.
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("add(4, 5) = " + add(3, 5));
        System.out.println("subtract(7,4) = " + subtract(4, 7));
        System.out.println("multiply(4,5) = " + multiply(4, 5));
        System.out.println("divide(20,0) = " + divide(20, 2));
        System.out.println("square(7) = " + square(7));
        System.out.println("average(8,3) = " + average(8, 3,6));
        System.out.println("modulus(4,6) = " + modulus(36, 6));
        System.out.println("max(7,4) = " + max(7, 4));
        System.out.println("min(2,7) = " + min(2, 7));
        System.out.println("isEven(678) = " + isEven(678));
    }
}

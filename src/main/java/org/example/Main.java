package org.example;

import java.io.InterruptedIOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();
        int length = digits.length;

        for (int i = 0; i < digits.length / 2; i++) {
            if (digits[i] != digits[length - 1 - i]) {
                return false;

            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 0)
            return false;

        int sum = 1;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num)
            return true;

        return false;
    }

    public static String numberToWords(int num) {
        if (num < 0)
            return "Invalid Value";

        char[] digits = String.valueOf(num).toCharArray();

        String[] oneDigit = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            int parsedDigit = Character.getNumericValue(digits[i]);
            strBuilder.append(oneDigit[parsedDigit]);
            if (i < digits.length - 1) {
                strBuilder.append(" ");
            }
        }
        return strBuilder.toString();
    }
}

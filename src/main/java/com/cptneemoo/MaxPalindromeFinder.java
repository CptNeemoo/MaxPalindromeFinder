package com.cptneemoo;

import java.util.logging.Logger;

public class MaxPalindromeFinder {

    private static Logger log = Logger.getLogger(MaxPalindromeFinder.class.getName());

    public static void main(String[] args) {
        log.info(String.format("The maximum palindrome created by multiplication of two 4-digit numbers is %d"
                ,findMaxPalindrome()));
    }

    static long findMaxPalindrome() {
        long max = 0;
        for (int i = 9999; i > 1000; i--) {
            for (int j = i; j > 1000; j--) {
                long multiplicationResult = i * j;
                if (multiplicationResult > max && MaxPalindromeFinder.isPalindrome(multiplicationResult)) {
                    max = multiplicationResult;
                }
            }
        }
        return max;
    }


    static boolean isPalindrome(long number) {
        char[] numberArray = Long.toString(number).toCharArray();
        boolean result = true;
        for (int i = 0; i < numberArray.length / 2; i++) {
            result &= numberArray[i] == numberArray[numberArray.length - i - 1];
        }
        return result;
    }


}

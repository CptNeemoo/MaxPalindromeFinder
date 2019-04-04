package com.cptneemoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPalindromeFinderTest {

    @Test
    void findMaxPalindrome() {
        long expected = 99000099;
        long actual = MaxPalindromeFinder.findMaxPalindrome();
        assertEquals(expected, actual);
    }

    @Test
    void isPalindrome() {
        assertTrue(MaxPalindromeFinder.isPalindrome(12321));
        assertFalse(MaxPalindromeFinder.isPalindrome(123));
    }
}
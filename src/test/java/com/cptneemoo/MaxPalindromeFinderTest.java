package com.cptneemoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxPalindromeFinderTest {

    @Test
    void findMaxPalindrome() {
        long expected = 99000099;
        long actual = MaxPalindromeFinder.findMaxPalindrome();
        assertEquals(expected, actual);
    }
}
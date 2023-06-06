package com.simonjoz.katas.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsogramCheckerTest {

    @Test
    public void FixedTests() {
        assertTrue(IsogramChecker.isIsogram("Dermatoglyphics"));
        assertTrue(IsogramChecker.isIsogram("isogram"));
        assertFalse(IsogramChecker.isIsogram("moose"));
        assertFalse(IsogramChecker.isIsogram("isIsogram"));
        assertFalse(IsogramChecker.isIsogram("aba"));
        assertFalse(IsogramChecker.isIsogram("moOse"));
        assertTrue(IsogramChecker.isIsogram("thumbscrewjapingly"));
        assertTrue(IsogramChecker.isIsogram(""));
    }

}

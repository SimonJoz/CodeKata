package com.simonjoz.katas.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramCheckerTest {

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertTrue(PangramChecker.isPangram(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        assertFalse(PangramChecker.isPangram(pangram2));
    }
}

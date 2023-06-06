package com.simonjoz.katas.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOCheckerTest {

    @Test
    public void testSomething1() {
        assertTrue(XOChecker.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertTrue(XOChecker.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertFalse(XOChecker.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertFalse(XOChecker.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertFalse(XOChecker.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertTrue(XOChecker.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertFalse(XOChecker.getXO("Xxxxertr34"));
    }
}

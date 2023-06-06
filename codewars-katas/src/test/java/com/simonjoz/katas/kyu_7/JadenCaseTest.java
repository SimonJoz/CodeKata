package com.simonjoz.katas.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JadenCaseTest {

    @Test
    public void test() {
        assertEquals("Most Trees Are Blue", JadenCase.toJadenCase("most trees are blue"),
                "toJadenCase doesn't return a valid JadenCase String! try again please :)");
    }

    @Test
    public void testNullArg() {
        assertNull(JadenCase.toJadenCase(null), "Must return null when the arg is null");
    }

    @Test
    public void testEmptyArg() {
        assertNull(JadenCase.toJadenCase(""), "Must return null when the arg is empty string");
    }

}

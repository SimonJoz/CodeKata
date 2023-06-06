package com.simonjoz.katas.kyu_7;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryArrayToNumberTest {


    @Test
    public void convertBinaryArrayToInt() {
        assertEquals(1, BinaryArrayToNumber.convertBinaryArrayToInt(List.of(0, 0, 0, 1)));
        assertEquals(15, BinaryArrayToNumber.convertBinaryArrayToInt(List.of(1, 1, 1, 1)));
        assertEquals(6, BinaryArrayToNumber.convertBinaryArrayToInt(List.of(0, 1, 1, 0)));
        assertEquals(9, BinaryArrayToNumber.convertBinaryArrayToInt(List.of(1, 0, 0, 1)));
    }
}

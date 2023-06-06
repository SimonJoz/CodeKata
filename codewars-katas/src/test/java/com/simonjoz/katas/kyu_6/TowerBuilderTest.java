package com.simonjoz.katas.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerBuilderTest {

    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", TowerBuilder.build(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", TowerBuilder.build(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", TowerBuilder.build(3)));
    }

}

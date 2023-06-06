package com.simonjoz.katas.kyu_5;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IPTest {

    private static final Random random = new Random();

    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", IP.longToIP(2154959208L));
        assertEquals("0.0.0.0", IP.longToIP(0));
        assertEquals("128.32.10.1", IP.longToIP(2149583361L));
    }


    private static String solution(long ip) {
        return (ip >>> 24) % 256 + "." + (ip >>> 16) % 256 + "." + (ip >>> 8) % 256 + "." + ip % 256;
    }

    @Test
    public void randomTest() {
        final int Tests = 100;

        for (int i = 0; i < Tests; ++i) {
            long thirtyBits = random.nextInt(1 << 30);
            long twoBits = random.nextInt(1 << 2);
            long fullRange = (thirtyBits << 2) | twoBits;

            String expected = solution(fullRange);
            String actual = IP.longToIP(fullRange);

            assertEquals(expected, actual);
        }
    }

}

package com.simonjoz.katas.kyu_5;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrambliesTest {

    private static void testing(String s1, String s2, boolean expected) {
        boolean actual = Scramblies.scramble(s1, s2);
        assertEquals(expected, actual, String.format("Incorrect answer for inputs:\ns1=%s\ns2=%s\n", s1, s2));
    }

    @Test @Order(1)
    public void fixedTests() {

        testing("rkqodlw",           "world",      true );
        testing("cedewaraaossoqqyt", "codewars",   true );
        testing("katas",             "steak",      false);
        testing("scriptjavx",        "javascript", false);
        testing("scriptingjava",     "javascript", true );
        testing("scriptsjava",       "javascripts",true );
        testing("javscripts",        "javascript", false);
        testing("aabbcamaomsccdd",   "commas",     true );
        testing("commas",            "commas",     true );
        testing("sammoc",            "commas",     true );
    }

    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static String doEx(int l, int c) {
        StringBuilder res = new StringBuilder();
        int n = -1;
        for (int i = 0; i < l; i++) {
            do {
                n = randInt(97, 122);
            } while (n == c);
            res.append((char)n);
        }
        return res.toString();
    }

    private static boolean scrambleSol(String str1, String str2) {
        if (str1.length() < str2.length()) return false;
        int[] alpha1 = new int[26];
        int[] alpha2 = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            int c = str1.charAt(i);
            alpha1[c - 97]++;
        }
        for(int i = 0; i < str2.length(); i++) {
            int c = str2.charAt(i);
            alpha2[c - 97]++;
        }
        for(int i = 0; i < 26; i++) {
            if(alpha1[i] < alpha2[i])
                return false;
        }
        return true;
    }

    @Test  @Order(2)
    public void randomSmallTests() {
        for (int i = 0; i < 4; i++) {
            int n = randInt(0, 500);
            String s1 = doEx(n, -1);
            int m = randInt(0, 200);
            String s2 = doEx(m, -1);
            boolean r = scrambleSol(s1, s2);
            testing(s1,s2,r);
        }
    }

    @Test  @Order(3)
    public void largeTest() {
        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);
        assertTrue(Scramblies.scramble(s1, s2));
    }

    @Test  @Order(4)
    public void randomPerformanceTest1() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            String s1;
            int m = randInt(140_000, 150_000);
            String s2 = doEx(m, -1);
            int n = randInt(1, 2);
            if (n % 2 == 0) {
                s1 = s2 + s2;
            } else {
                s1 = s2;
                s2 = s1 + "abmosr";
            }
            boolean r = scrambleSol(s1, s2);
            assertEquals(r, Scramblies.scramble(s1,s2));
        }
        long end = System.currentTimeMillis() - start;
        assertTrue(end <= 16000);
    }

    @Test  @Order(5)
    public void randomPerformanceTest2() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            int n = randInt(160_000, 180_000);
            String s1 = doEx(n, 97);
            int m = randInt(0, 30);
            String s2 = doEx(m, 120);
            boolean r = scrambleSol(s1, s2);
            assertEquals(r, Scramblies.scramble(s1,s2));
        }
        long end = System.currentTimeMillis() - start;
        assertTrue(end <= 16000);
    }
}

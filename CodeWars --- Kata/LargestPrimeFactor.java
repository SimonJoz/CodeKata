package com.company.katas;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    private static int getLargestPrime(int number) {
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                number = number / i;
                i--;
            }
        }
        return i;
    }
}

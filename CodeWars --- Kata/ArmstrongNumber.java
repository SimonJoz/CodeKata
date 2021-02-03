package com.company.katas;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }

    //// An Armstrong number is a number that is the sum of its own digits each
    // raised to the power of the number of digits.
        //// 153 --- 1^3 + 5^3 + 3^3 = 153;
        //// 9 --- 9^1 = 9


    private static boolean armstrongNumber(int number) {

        int temp, sum = 0, n = number;
        int length = String.valueOf(n).length();
        while (n > 0) {
            temp = n % 10;
            n = n / 10;
            sum += Math.pow(temp, length);
        }
        return sum == number;
    }
}


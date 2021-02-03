package com.company;

public class LuhnAlgorithm {

    public boolean validateCardNumber(String number) {
        // Luhn Algorithm
        String withoutCheckSum = number.substring(0, number.length() - 1);
        int checkSum = Integer.parseInt(number.substring(number.length() - 1));
        int sum = 0;
        for (String str : withoutCheckSum.split("")) {
            int numb = Integer.parseInt(str);
            if (numb != 0 && numb % 2 == 0) {
                numb = numb * 2;
                if (numb > 9) {
                    numb = numb - 9;
                }
            }
            sum += numb;
        }
        return (sum + checkSum) % 10 == 0;
    }
}

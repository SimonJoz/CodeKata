package com.simonjoz.katas.kyu_7;

public class CreditCardMasker {

    /*
    7Kyu
    Usually when you buy something, you're asked whether your credit card number,
    phone number or answer to your most secret question is still correct. However,
    since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
    Your task is to write a function mask, which changes all but the last four characters into '#'.

    Examples
    "4556364607935616" --> "############5616"
         "64607935616" -->      "#######5616"
                   "1" -->                "1"
                    "" -->                 ""

    // "What was the name of your first pet?"

    "Skippy" --> "##ippy"

    "Nananananananananananananananana Batman!"
    -->
    "####################################man!"
    */

    public static void main(String[] args) {

        System.out.println(mask("4556364607935616"));
    }

    public static String mask(String str) {

        if (str == null || str.length() < 4 ) {
            return str;
        }

        int idx = str.length() - 4;
        return str.substring(0, idx).replaceAll(".", "#") + str.substring(idx);
    }
}

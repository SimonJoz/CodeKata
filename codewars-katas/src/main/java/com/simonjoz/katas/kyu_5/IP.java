package com.simonjoz.katas.kyu_5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IP {

    //  Take the following IPv4 address: 128.32.10.1
    //
    //  This address has 4 octets where each octet is a single byte (or 8 bits).
    //
    //  1st octet 128 has the binary representation: 10000000
    //  2nd octet 32 has the binary representation: 00100000
    //  3rd octet 10 has the binary representation: 00001010
    //  4th octet 1 has the binary representation: 00000001
    //  So 128.32.10.1 == 10000000.00100000.00001010.00000001
    //
    //  Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
    //
    //  Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.

    public static void main(String[] args) {
        System.out.println(longToIP(0));
    }

    public static String longToIP(long ip) {

        String[] octets = String.format("%32s", Long.toBinaryString(ip))
                .replaceAll("\\s", "0")
                .split("(?<=\\G.{8})");

        return Arrays.stream(octets)
                .map(binary -> String.valueOf(Integer.parseInt(binary, 2)))
                .collect(Collectors.joining("."));
    }
}

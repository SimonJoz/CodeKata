package com.company.katas;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReversedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reveredArray(new int[]{20,10,5,80})));

    }

    private static int[] reveredArray(int[] arr){
        int index = 0;
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[index] = arr[i];
            index++;
        }
        return reversed;
    }
    
  
    }
}

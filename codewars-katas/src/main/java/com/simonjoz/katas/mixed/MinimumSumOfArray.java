package com.company.katas;

import java.util.Arrays;

public class MinimumSumOfArray {

//    Given an array of integers , Find the minimum sum which is obtained from summing each Two integers product .
//            Notes
//    Array/list will contain positives only .
//            Array/list will always has even size
//    Input >> Output Examples
//    minSum({5,4,2,3}) ==> return (22)

//    Explanation:
//    The minimum sum obtained from summing each two integers product , 5*2 + 3*4 = 22
//    minSum({12,6,10,26,3,24}) ==> return (342)

//    Explanation:
//    The minimum sum obtained from summing each two integers product , 26*3 + 24*6 + 12*10 = 342
//    minSum({9,2,8,7,5,4,0,6}) ==> return (74)
//    Explanation:
//
//    The minimum sum obtained from summing each two integers product , 9*0 + 8*2 +7*4 +6*5 = 74

    public static int minSum(int[] numbs) {
        if (numbs.length % 2 != 0) return 0;
        int sum = 0, j = 0;
        Arrays.sort(numbs);
        for (int i = numbs.length - 1; i >= 0; i--) {
            if (i <= j) break;
            sum += numbs[i] * numbs[j];
            j++;
        }
        return sum;

    }
}

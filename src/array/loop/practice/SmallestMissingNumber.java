package array.loop.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
Find the smallest missing number.
Given a sorted array of n distinct integers where each integer is in the range from
0 to m-1 and m > n. Find the smallest number that is missing from the array.
Examples:
Input: {0, 1, 2, 6, 9}, n = 5, m = 10
Output: 3.
Input: {0, 1, 2, 3}, n = 4, m = 5
Output: 4.
 */

public class SmallestMissingNumber {
    public static void main(String[] args) {
        int[] inputArray = {0, 1, 2, 3, 4};
        int m = 7;
        System.out.println(findFirstMissing(inputArray, m));
    }

    static int findFirstMissing(int[] inputArray, int m) {
        boolean isFoundMissingNumber = false;
        int result = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != i) {
                //isFoundMissingNumber = true;
                return i;
            }
        }
        // if (isFoundMissingNumber == false) {
        if (inputArray[inputArray.length - 1] != m - 1) {
            return inputArray[inputArray.length - 1] + 1;
        }
        // }
        return -1;
    }
}


package array.loop.practice;

import java.util.Arrays;
/*
Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed
to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same.
Example:

Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
 */

public class Move_allZeros_to_end {
    public static void main(String[] args) {
        int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        // int[] outputArray=new int[];
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];;
                j = j + 1;
            }
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println("The present index of j is " + j);
        for (int k = j; k < newArray.length; k++) {
            array[k] = 0;
        }
        System.out.println(Arrays.toString(newArray));
    }
}

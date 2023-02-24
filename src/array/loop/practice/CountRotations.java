package array.loop.practice;

import java.util.Arrays;
/*
Find the Rotation Count in Rotated Sorted array.
Given an array arr[] of size N having distinct numbers sorted in increasing order and
the array has been right rotated (i.e, the last element will be cyclically shifted to
the starting position of the array) k number of times, the task is to find the value of k.
Input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation: Initial array must be {2, 3, 6, 12, 15, 18}.
We get the given array after rotating the initial array twice.
 */
public class CountRotations {
    public static void main(String[] args) {
        int[] array = {15, 18, 3, 6, 12};
        int min = array[0], min_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                min_index = i;
                System.out.println(min_index);
            }
        }
    }
}



package array.loop.practice;

import java.util.Arrays;

/*
Rearrange an array such that arr[i] = i.
Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array.
If the element is not present then there will be -1 present in the array. Rearrange the array such that
A[i] = i and if i is not present, display -1 at that place.
Examples:
Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
 */
public class RearrangeArrayAccordingIndexON {
    public static void main(String[] args) {
        //int[] array = {0, 3, 5, 1, 4};
        int[] array = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int start = 0;
        int temp = 0;
        int end = 0;
        while (start < array.length) {
            if (start == array[end]) {
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
            if (start == array.length - 1) {
                if (end == array.length - 1) {
                    break;
                }
            }
            if (end == array.length - 1) {
                start++;
                // end = start + 1;
                end = 0;
            } else {
                end++;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                array[i] = -1;
            }
            System.out.print(array[i] + " ");
        }
    }
}



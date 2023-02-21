package array.loop.practice;

import java.util.Arrays;
/*
Given an array of elements of length N, ranging from 0 to N – 1. All elements may not
be present in the array. If the element is not present then there will be -1 present
 in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

Examples:

Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
 */

public class ReArrangeArrayAsIndexONSquare {
    public static void main(String[] args) {
        // int[] array = new int[5];
        // int[] array = {1, 3, 4, 6, 5, 9, -1, -1, -1,12};
        int[] array = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        int temp;
        // Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("fill the element according to index" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            // If not present
            if (array[i] != i) {
                array[i] = -1;
            }
        }
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


package array.loop.practice;

import java.util.Arrays;
/*
Print All Distinct Elements of a given integer array.
Given an integer array, print all distinct elements in array.
The given array may contain duplicates and the output should print every element only once.
The given array is not sorted.
Examples:
Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
Output: 12, 10, 9, 45, 2
 */
public class distinct_element_array {
    public static void main(String args[]) {
        int k = 0;
        int[] array = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    //  if(array[i]>0) {
                    array[j] = -1;
                    // }
                }
            }
            resultArray[k++] = array[i];
        }
        // System.out.println(Arrays.toString(resultArray));
        for (k = 0; k < resultArray.length; k++) {
            if (resultArray[k] > 0) {
                System.out.print(resultArray[k] + " ");
            }
        }


    }
}

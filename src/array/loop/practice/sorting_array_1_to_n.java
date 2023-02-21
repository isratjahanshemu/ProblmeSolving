package array.loop.practice;

import java.util.Arrays;

/*
Sort an array which contain 1 to n values.
You have given an array which contain 1 to n element, your task is to sort this array
in an efficient way and without replace with 1 to n numbers.
Examples :k
Input : arr[] = {3, 2, 5, 17, 1, 4};
Output :1 2 3 4 5 17
 */
public class sorting_array_1_to_n {
    public static void main(String[] args) {
//      int[] arr = {3, 2, 5, 17, 1, 4};
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        int temp = 0;
        int i = 0;
        int j = i + 1;
        while (i < arr.length) {
            if (arr[i] >= arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (i == arr.length - 2)   //because when i=4(length 6-2=4) then it is already sorted from
                break;                 //the previous a[i]>=a[j] condition. If we still continue then once
            //the i=5 and j will be 6. but there is no index of 6.
            if (j == arr.length - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }
        // System.out.println(Arrays.toString(arr));
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}




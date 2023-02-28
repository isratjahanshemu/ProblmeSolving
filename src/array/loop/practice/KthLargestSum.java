package array.loop.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
K-th Largest Sum Contiguous Subarray.
Given an array of integers. Write a program to find the K-th largest sum of contiguous
subarray within the array of numbers that has both negative and positive numbers.
Input: a[] = {20, -5, -1}, K = 3
Output: 14
Explanation: All sum of contiguous subarrays are (20, 15, 14, -5, -6, -1)
so the 3rd largest sum is 14.
 */
public class KthLargestSum {
    public static void main(String[] args) {
        int[] inputArray = {20, -5, -1};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = input.nextInt();
        System.out.println(kthLargestSum(inputArray, k));
    }

    static int kthLargestSum(int[] inputArray, int k) {
        //Use ArrayList instead of Array to store subarray sum because don't know the size of the subarray
        //sum while needed to declare an array(int[] result=new int[what is the size of the subarray sum];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            int sum = 0;
            for (int j = i; j < inputArray.length; j++) {
                sum = sum + inputArray[j];
                result.add(sum);
            }
        }
        //Print ArrayList result Sub Array Sum.
        System.out.println(result);
        //Sort the ArrayList result in Descending Order.
        Collections.sort(result, Collections.reverseOrder());
        //Print the Sorted ArrayList.
        System.out.println(result);
        return result.get(k - 1);
    }
}
//@author ISRAT.

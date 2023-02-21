package array.loop.practice;

import java.util.Scanner;
/*
Find Subarray with given sum.
Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum, print first such subarray.
Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
 */
public class find_subArray_with_given_sum {
    public static void main(String[] args) {
        int[] array = {1, 4, 0, 0, 3, 5, 10};
       // Scanner input = new Scanner(System.in);
        int sum = 8;
        boolean isSubarrayFound=false;
        for (int i = 0; i < array.length; i++) {
            int currentSum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                currentSum = currentSum + array[j];
                if (currentSum == sum) {
                    System.out.println("Sum found between indexes " + i + " and " + j);
                    isSubarrayFound=true;
                    break;
//                    return; //The return statement is used to exit the program when the desired outcome is achieved.
                }
             }
            if(isSubarrayFound){
                break;
            }
        }
        if(isSubarrayFound==false){
            System.out.println("No subarray found");
        }
    }
}


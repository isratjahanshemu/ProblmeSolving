package array.loop.practice;

import java.util.Arrays;
import java.util.Scanner;
/*
Reversal algorithm for Array rotation.
Given an array arr[] of size N, the task is to rotate
the array by d position to the left.
Examples:
Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3, 4, 5, 6, 7, 1, 2
 */
public class RotateArrayByDPosition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input the position d");
        int d=input.nextInt();
        int[] array={1,3,5,7,9};
        int[] newArray=new int[array.length];
        int k=0;
        for(int i=d;i< array.length;i++){
            newArray[k++]=array[i];
        }
        System.out.println(Arrays.toString(newArray));
        for(int i=0;i<d;i++){
            newArray[k++]=array[i];
        }
        System.out.println(Arrays.toString(newArray));

    }

}

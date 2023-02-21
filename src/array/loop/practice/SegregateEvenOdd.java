package array.loop.practice;

import java.util.Arrays;
/*
Segregate even and odd numbers.
Given an array arr[] of integers, segregate even and odd numbers in the array.
Such that all the even numbers should be present first, and then the odd numbers.
Examples:
Input: arr[] = 1 9 5 3 2 6 7 11
Output: 2 6 5 3 1 9 7 11
 */

public class SegregateEvenOdd {
    public static void main(String[] args) {
        int temp=0;
        int[] array={1,4,5,8,7,9,11};
        int[] newArray=new int[array.length];
        int k=0;
       // for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                if(array[j]%2==0){
                  newArray[k++]=array[j];
                }
            }
        System.out.println(Arrays.toString(newArray));
            for(int j=0;j< newArray.length;j++){
                if(array[j]%2!=0){
                    newArray[k++]=array[j];
                }
            }
       // System.out.println(Arrays.toString(newArray));
        for(k=0;k< newArray.length;k++){
            System.out.print(newArray[k]+" ");
        }

    }
    }


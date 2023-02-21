package array.loop.practice;

import java.util.Arrays;
/*
Sort an array in wave form.
Given an unsorted array of integers, sort the array into a wave array.
An array arr[0..n-1] is sorted in wave form if:
arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
Examples:
Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
 */
public class sort_array_wave_form {
    public static void main(String[] args) {
        int[] array={20, 10, 8, 6, 4, 2};
        int temp=0;
        for(int i=0;i< array.length-1;i++){
            if(i%2==0){
                if(array[i]<=array[i+1]){
                  temp=array[i];
                  array[i]=array[i+1];
                  array[i+1]=temp;
                }
            }
            else{
                if(array[i]>=array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

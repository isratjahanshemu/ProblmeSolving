package array.loop.practice;

import java.util.Arrays;
/*
Rearrange an array (Already sorted array) in maximum minimum form using Two Pointer Technique.
Given a sorted array of positive integers, rearrange the array alternately i.e
first element should be a maximum value, at second position minimum value,
at third position second max, at fourth position second min, and so on.
Examples:
Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
 */

public class MaxMinMaxMinOrder {

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 7, 8, 9};
        int small = 0;
        int high = array.length - 1;
        int[] newArray = new int[array.length];
        int k = 0;
//        for(int i=0;i<array.length;i++){
//            if(i%2==0){
//                newArray[k++]=array[high--];
//            }
//            else {
//                newArray[k++]=array[small++];
//            }
//        }
//        System.out.print(Arrays.toString(newArray));
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (flag) {
                newArray[k++] = array[high--];
            } else {
                if (k > newArray.length - 1) {
                    break;
                }
                newArray[k++] = array[small++];
            }
            flag = !flag;
            if (k > newArray.length - 1) {
                break;
            }
        }
        for (k = 0; k < newArray.length; k++) {
            System.out.print(newArray[k] + " ");
        }
    }

}



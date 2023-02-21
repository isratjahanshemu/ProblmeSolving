package array.loop.practice;

import java.util.Arrays;
/*
Reorder an array according to given indexes.
Given two integer arrays of same size, “arr[]” and “index[]”,
reorder elements in “arr[]” according to given index array.
It is not allowed to given array arr’s length.
Input:  arr[]   = [10, 11, 12];
            index[] = [1, 0, 2];
Output: arr[]   = [11, 10, 12]
           index[] = [0,  1,  2]
 */
public class ReorderArrayByGivenIndex {
    public static void main(String[] args) {
        int[] array={7,1,10,5,6};
        int[] index={2,0,1,3,4};
        int[] temp=new int[array.length];
        for(int i=0;i< array.length;i++){
            temp[index[i]]=array[i];
            index[i]=i;
        }
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(index));
    }
}

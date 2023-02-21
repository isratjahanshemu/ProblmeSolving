package array.loop.practice;

import java.util.Arrays;
/*
Rearrange Array such that Even Positioned are Greater than Odd.
Input: Given an array, array [n] = [2, 4, 3, 5, 6], where "n" is the size of the array.
Output: The output array would be array [] = [2, 6, 3, 5, 4].

array[i-1] >= array[i],if i is even.suppose i=2, array[2] means position is 3.Because index starts from 0.
array[i-1] <= array[i],if i is odd.
 */
public class Even_Position_Greater {
    public static void main(String[] args) {
        int[] array = {4,9,11,2};
        int temp = 0;
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) {
                if (array[i-1] <= array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            else {
               if(array[i-1] >= array[i]){
                   temp = array[i];
                   array[i] = array[i - 1];
                   array[i - 1] = temp;
               }
            }

        }
        System.out.println(Arrays.toString(array));
    }
}

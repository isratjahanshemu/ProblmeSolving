package array.loop.practice;

import java.util.Arrays;
/*
 Rearrange positive and negative numbers in O(n) time and O(1) extra space.
 Input:[-1, 2, -3, 4, 5, 6, -7, 8, 9].
 Output: [9, -7, 8, -3, 5, -1, 2, 4, 6].
 */
public class RearrangePositiveNegativeONTime {
    public static void main(String[] args) {
        //int[] array = {-1, 2, -3, -4, -5, 6, -7, 8, 9};
        int[] array = {-1, 2, -3, 4};
        int[] newArray = new int[array.length];
        int i = 0;
        int k = 0;
        Arrays.sort(array);
        int high = array.length - 1;
        int small = 0;
        boolean flag = true;
        while (i < array.length) {
            if (flag) {
                newArray[k] = array[high--];
                k++;
            } else {
                newArray[k++] = array[small++];
            }
            flag = !flag;
            if (k > newArray.length - 1) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        for (k = 0; k < newArray.length; k++) {
            System.out.print(newArray[k] + " ");
        }
    }
}

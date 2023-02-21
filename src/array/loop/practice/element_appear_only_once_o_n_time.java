package array.loop.practice;
import java.util.Arrays;
/*
Find the element that appears once in an array where every other element appears twice.
Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2
Here we applied O(n) time.
 */
public class element_appear_only_once_o_n_time {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 4, 5, 3, 4};
        int i = 0;
        int j = i + 1;
        while (i < array.length - 1) {
            if (array[i] == array[j]) {
                array[i] = -1;
                array[j] = -1;
            }
            if (j == array.length - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }
        // System.out.println(Arrays.toString(array));
        for (i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }
}

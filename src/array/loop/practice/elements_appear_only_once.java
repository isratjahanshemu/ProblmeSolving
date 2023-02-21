package array.loop.practice;
import java.util.Arrays;
/*
Find the element that appears once in an array where every other element appears twice.
Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2
Here we applied O(n^2) time.
 */
public class elements_appear_only_once {
    public static void main(String[] args) {
        distinctElements();
    }
    static void distinctElements() {
        // public static void main(String args[]) {
        int[] array = {2, 3, 5, 4, 5, 3, 4};
        int[] resultArray = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = -1;
                    array[j] = -1;
                }
            }
            resultArray[k++] = array[i];
        }
        for (k = 0; k < resultArray.length; k++) {
            if (resultArray[k] > 0) {
                System.out.print(resultArray[k] + " ");
            }
        }

    }
}

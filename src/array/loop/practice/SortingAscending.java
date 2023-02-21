package array.loop.practice;

import java.util.Arrays;

public class SortingAscending {
    public static void main(String[] args) {
        int temp = 0;
        int[] array = {33, 14, 1, 1, 9, 17, 65, 5, 11};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] <= array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));

    }
}

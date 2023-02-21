package array.loop.practice;

import java.util.Arrays;

public class SortingArrayAscendingOrder {
    public static void main(String[] args) {
        int temp = 0;
        int[] array = {3, 7, 2, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println("Step by step comparing i to j" + Arrays.toString(array));
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


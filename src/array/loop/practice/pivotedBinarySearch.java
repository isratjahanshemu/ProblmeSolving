package array.loop.practice;

import java.util.Scanner;

/*
Search an element in a sorted and rotated Array.
Given a sorted and rotated array arr[] of size N and a key,
the task is to find the key in the array.
Note: Find the element in O(logN) time and assume that all the elements are distinct.
Example:
Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
Output : Found at index 8
Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 30
Output : Not found
 */
public class pivotedBinarySearch {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element you want to know the index");
        int key = scanner.nextInt();
        boolean isPivotedBinary = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Found at index " + i);
            } else {
                System.out.println("Not found");
                break;
            }
        }
    }
}

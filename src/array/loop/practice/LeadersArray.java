package array.loop.practice;
/*
Find the Leaders in an array.
Example
Input: [2,4,6,3,1,2] Output: 6,3,2.
Input: [1,3,6,9,2,5] Output: 9,5.
Explanation
In the first example, where Input: [2,4,6,3,1,2], Output: 6,3,2, we can see that the leaders are 6, 3, and 2 because
2 is the rightmost element, so it is a leader.
3 is greater than all the elements on its right side i.e. 3 is greater than 1 and 2, so it is a leader.
6 is greater than all the elements on its right side i.e. 6 is greater than 3, 1, and 2, so it is a leader.
We have used o(n^2) approach here.
 */
public class LeadersArray {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    array[i] = -1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

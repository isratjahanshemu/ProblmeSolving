package array.loop.practice;
/*
Find Subarray with given sum.
Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum, print first such subarray.
Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
 */
public class SubarraySum {
    /* Returns true if the there is a
subarray of arr[] with a sum equal to
       'sum' otherwise returns false.
Also, prints the result */
    void subArraySum(int arr[], int n, int sum) {
        // Pick a starting point
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];

            if (currentSum == sum) {
                System.out.println("Sum found at indexe "
                        + i);
                return;
            } else {
                // Try all subarrays starting with 'i'
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];

                    if (currentSum == sum) {
                        System.out.println(
                                "Sum found between indexes " + i
                                        + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }
    public static void main(String[] args) {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = {1, 4, 0, 0, 3, 5, 10};
        int n = arr.length;
        int sum = 8;
        arraysum.subArraySum(arr, n, sum);
    }
}

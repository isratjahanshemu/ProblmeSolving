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
We have used o(n) approach here.
 */
public class leaders_array_o_n_time {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
  //      int i = 0;
        //      int j = i + 1;
//        while (i < array.length) {
//            if (array[i] < array[j]) {
//                array[i] = -1;
//            }
//            if (i == array.length - 2) {
//                break;
//            }
//            if (j == array.length - 1) {
//                i++;
//                j = i + 1;
//            } else {
//                j++;
//            }
//        }
//        for (i = 0; i < array.length; i++) {
//            if (array[i] >= 0) {
//                System.out.print(array[i] + " ");
//            }
//        }
        //Another O(N) approach:
        int max_from_right= array[array.length-1];
        System.out.print(max_from_right+" "); //As rightmost element is always Leader.
        for(int i=array.length-2;i>=0;i--){
            if(array[i]>max_from_right){
                max_from_right=array[i];
                System.out.print(max_from_right +" ");
            }
        }

    }
}

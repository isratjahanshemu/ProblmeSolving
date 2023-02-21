package array.loop.practice;

import java.util.Arrays;
/*
Count the number of possible triangles.
Given an unsorted array of positive integers, find the number of triangles that
can be formed with three different array elements as three sides of triangles.
For a triangle to be possible from 3 values, the sum of any of the two values (or sides)
must be greater than the third value (or third side).
My approach will be at first find the smaller values from the Three because
The sum of Two smaller sides of a triangle must be greater than the Third side.
For this, we need to sort the array in ascending order.
Input: arr= {4, 6, 3, 7}
Output: 3
Explanation: There are three triangles
possible {3, 4, 6}, {4, 6, 7} and {3, 6, 7}.
Note that {3, 4, 7} is not a possible triangle
 */
public class count_possible_triangles {
    public static void main(String[] args) {
        int[] array={10, 22, 21, 300, 200, 101, 100};
        Arrays.sort(array);
        int count=0;
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                for(int k=j+1;k< array.length;k++){
                    if(array[i]+array[j]>array[k]){
                        count++;
                    }

                }
            }
        }
        System.out.println("The possible numbers of triangles are "+count);
    }
}

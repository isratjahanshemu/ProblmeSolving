package array.loop.practice;

public class OddCountWithLoop {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("The current number under investigation "+array[i]);
            if (array[i] % 2 != 0) {
                counter++;
            }
            System.out.println("The value of counter is "+counter);

        }
        System.out.println("Total Odd Numbers found " + counter);
    }
}

package array.loop.practice;

public class FrequentElement {
    public static void main(String[] args) {

        int maxCounter = 0;
        int element_having_maximum_frequency = 0;
        int[] array = {2, 5, 2, 2, 8, 6, 8, 8, 2, 9, 8, 8, 5, 8};
        //for(int i=0;i<array.length-1;i++){
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;

                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                element_having_maximum_frequency = array[i];
            }
        }
        System.out.println(element_having_maximum_frequency);
    }
}

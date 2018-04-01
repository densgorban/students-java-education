package sort;

import java.util.Random;

public class SortMain {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            int randInt = random.nextInt();
            arr[i] = randInt;
        }
//        printArray(arr);
        SortInterface bubbleSort =  new BubbleSort();
        //sort is started
        long start = System.currentTimeMillis();
        int[] sorted = bubbleSort.sort(arr);
        long end = System.currentTimeMillis();

//        printArray(sorted);
        System.out.println("\nTotal time: " + (end - start));
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

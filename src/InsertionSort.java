import java.util.Arrays;

/**
 * @author Ksenia Koldaeva
 * Created: 10/29/17
 * Last Updated:
 */
public class InsertionSort {
    public static void insertionSortDecreasing(int[] array) {
        // iterate over the array starting from index 1
        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < key) {
                // move elements up
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = key;

        }
    }

    public static void printArray(int[] array) {
        int arraySize = array.length;

        System.out.println("----------");
        for(int i = 0; i < arraySize; i++){

            System.out.print("| " + i + " | ");
            System.out.println(array[i] + " |");

            System.out.println("----------");

        }

    }

    public static void main(String[] args) {
        int[] array = {5, 2, 6, 1, 8, 3, 4};

         insertionSortDecreasing(array);
         printArray(array);


    }

}

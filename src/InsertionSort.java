/**
 * @author Ksenia Koldaeva
 * Created: 10/29/17
 * Last Updated: 01/08/2019
 */
public class InsertionSort {
    /**
     * Sorts an array of integers in increasing or decreasing order
     * @param arr array of integers
     * @param decreasing - if true the order of sorting is decreasing, otherwise increasing
     */
    public static void sort(int[] arr, boolean decreasing) {
        // iterate over the arr starting from index 1
        int key;

        if (decreasing) {
            for (int i = 1; i < arr.length; i++) {
                key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] < key) {
                    // move elements up
                    arr[j + 1] = arr[j];
                    --j;
                }

                arr[j + 1] = key;

            }
        } else {
            for (int i = 1; i < arr.length; i++) {
                key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    // move elements up
                    arr[j + 1] = arr[j];
                    --j;
                }

                arr[j + 1] = key;

            }
        }

    }

    /**
     * Driver method
     */
    public static void main(String[] args) {
        int[] array = {5, 2, 6, 1, 8, 3, 4};

         sort(array, true);
         Utils.printArray(array);
    }
}

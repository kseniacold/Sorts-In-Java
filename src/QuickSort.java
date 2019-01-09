import java.util.Arrays;

/**
 * @author Ksenia Koldaeva
 * Created: 10/30/17
 * Last Updated: 01/08/19
 *
 * Easy to understand and read implementation of the QuickSort Algorithm
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        // base case for recursive implementation
        if (low >= high) {
            return;
        } else {

            int pivotPosition = partition(arr, low, high);

            // sort to the left side of pivot
            quickSort(arr, low, pivotPosition - 1);

            // sort to the right side of pivot
            quickSort(arr, pivotPosition + 1, high);
        }

    }

    public static int partition(int arr[], int low, int high) {
        int leftPointer = low     ;
        int rightPointer = high + 1;
        int pivot = arr[low];


        while (true) {
            // scan from the left
            while (arr[++leftPointer] <= pivot && leftPointer < high) // stay in bounds
                ;

            // scan from right
            while (arr[--rightPointer] >= pivot && rightPointer > low) // stay in bounds
                ;

            if (leftPointer >= rightPointer) {
                break;
            }
            // swap items
            swap(arr, leftPointer, rightPointer);

        }

        // set pivot to the rightmost entry of left subarray
        swap(arr, low, rightPointer);
        return rightPointer;
    }

    public static void swap(int arr[], int indexOne, int indexTwo) {
        int temp = arr[indexOne];

        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }

    /**
     *
     * @param args
     */
    public static void main (String [] args) {
        int[] arrayToSort = {5, 9, 10, 12, 17, 1, 8, 11, 20, 32};

        quickSort(arrayToSort, 0, 3);

        System.out.println(Arrays.toString(arrayToSort));
    }
}

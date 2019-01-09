import java.util.Arrays;
import java.util.Collections;

/**
 * @author Ksenia Koldaeva
 * Created: 10/28/17
 * Last Updated: 01/08/19
 *
 * Implemenration of the MergeSort Algorithm with extra storage
 */
public class MergeSort {

    public static void sort(int [] arrayToSort) {
        if (arrayToSort.length <= 1) { return; }
        int [] firstSubArray = new int[arrayToSort.length / 2];
        int [] secondSubArray = new int[arrayToSort.length - firstSubArray.length];

        // copy first half of the array into first sub array
        for (int i = 0; i < firstSubArray.length; i++) {
            firstSubArray[i] = arrayToSort[i];
        }
        // copy second half of the array into second sub array
        for (int i = 0; i < secondSubArray.length ; i++) {
            secondSubArray[i] = arrayToSort[firstSubArray.length + i];
        }

        sort(firstSubArray);
        sort(secondSubArray);

        merge(firstSubArray, secondSubArray, arrayToSort);
    }

    public static void merge(int [] first, int [] second, int [] arrayToSort) {

        int nextPosition = 0;
        int nextInFirst = 0;
        int nextInSecond = 0;

        while (nextInFirst < first.length && nextInSecond < second.length) {
            if (first[nextInFirst] < second[nextInSecond]) {
                arrayToSort[nextPosition] = first[nextInFirst];
                nextInFirst++;
            } else {
                arrayToSort[nextPosition] = second[nextInSecond];
                nextInSecond++;
            }

            nextPosition++;
        }

        // copy remaining elements into the arrayToSort
        while (nextInFirst < first.length) {
            arrayToSort[nextPosition] = first[nextInFirst];
            nextInFirst++;
            nextPosition++;
        }

        while (nextInSecond < second.length) {
            arrayToSort[nextPosition] = second[nextInSecond];
            nextInSecond++;
            nextPosition++;
        }
    }

    public static void main (String [] args) {
        int [] arrayToSort = {99, 16, 3, 19, 13, 0, 13, 12 };
        Collections.shuffle(Arrays.asList(arrayToSort));
        sort(arrayToSort);

        System.out.println(Arrays.toString(arrayToSort));
    }
}

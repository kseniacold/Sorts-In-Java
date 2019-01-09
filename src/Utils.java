/**
 * @author kseniacold
 * Created: 1/8/19
 * Last Updated:
 */
public class Utils {
    /**
     * Simple utility function to print and array of integers
     * @param arr array of integers
     */
    public static void printArray(int[] arr) {
        int arraySize = arr.length;

        System.out.println("----------");
        for(int i = 0; i < arraySize; i++){

            System.out.print("| " + i + " | ");
            System.out.println(arr[i] + " |");

            System.out.println("----------");

        }

    }
}

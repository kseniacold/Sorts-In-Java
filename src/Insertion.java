import java.util.Arrays;

/**
 * @author kseniacold
 * Created: 4/5/18
 * Last Updated:
 */
public class Insertion {
    public static void sort(int [] arr) {
        int key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String [] args) {
        int [] arr = new int[]{9, 2, 7, 6, 4, 1};
        sort(arr);

        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.print("}");

        System.out.println(Arrays.toString(arr));
    }
}

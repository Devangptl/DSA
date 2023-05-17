import java.util.Arrays;// Sortted arr
import java.util.Collections;// reverse arr

public class InbuiltSort {

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer arr[] = { 5, 1, 3, 4, 2 }; // int type to Integer
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);

    }
}


public class Q1 {

    public static void getIndex(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.println(i + " ");
        }

        getIndex(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;

        getIndex(arr, key, 0);
    }
}

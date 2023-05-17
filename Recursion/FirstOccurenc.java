public class FirstOccurenc {

    public static int isFirstOccurenc(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return isFirstOccurenc(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 1, 5 };

        System.out.println(isFirstOccurenc(arr, 6, 0));

        // timecomplexity = O(n)
        // spacecomplexity = O(n)
    }
}

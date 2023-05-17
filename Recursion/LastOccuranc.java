public class LastOccuranc {

    public static int isLastOccurenc(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isFound = isLastOccurenc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 1, 5, 5, 7 };
        System.out.println(isLastOccurenc(arr, 5, 0));
    }
}

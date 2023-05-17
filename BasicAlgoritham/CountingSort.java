public class CountingSort {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int Count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            Count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < Count.length; i++) {
            while (Count[i] > 0) {
                arr[j] = i;
                j++;
                Count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 3, 5, 4, 5, 1, 3, };
        countingSort(arr);
        printArr(arr);
    }
}

class MergeSort {

    // printArr
    public static void printArr(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");

        }
        System.out.print("]");
        System.out.println();
    }

    // Merge Sort
    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    // merge
    public static void merge(int arr[], int si, int mid, int ei) {

        // temp arr
        int temp[] = new int[ei - si + 1];
        // create iterator
        int i = si; // index for 1st part
        int j = mid + 1;// Index for 2nd part
        int k = 0; // temp arr iterator (index for temp)

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // left site
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // rigth site
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);

        //time Complexity = O(nlogn)
        //space Complexity = O(n)

    }
}
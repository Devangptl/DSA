
public class Q1_easy {

    // print array
    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // mergeSort
    public static String[] mergeSort(String[] arr, int si, int ei) {
        //base case
        if (si == ei) {
            String A[] = { arr[si] };
            return A;
        }
        // kaam
        int mid = si + (ei - si) / 2;

        String arr1[] = mergeSort(arr, si, mid);
        String arr2[] = mergeSort(arr, mid + 1, ei);

        String arr3[] = merge(arr1, arr2);

        return arr3;
    }

    static String[] merge(String[] arr1, String[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m + n];

        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isOrderString(arr1[i], arr2[j])) {
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[j++];
            }
        }

        while (i < m) {
            arr3[idx++] = arr1[i++];
        }

        while (j < n) {
            arr3[idx] = arr2[j++];
        }

        return arr3;

    }

    static boolean isOrderString(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        String SortedArr[]=  mergeSort(arr, 0, arr.length -1 );
        printArr(SortedArr);

    }
}

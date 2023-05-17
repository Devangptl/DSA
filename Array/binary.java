public class binary {
    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 5, 45, 46, 87 }; // sorted array is compalsory
        int key = 87;
        int index = binarySearch(number, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("index number is : " + index);
        }

    }
}
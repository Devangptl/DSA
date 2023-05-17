
public class findLargestNum {
    public static int max(int arr[]) {
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
            }
            if(min1>arr[i]){
                min1 = arr[i];
            }
            sum += max1;
        }
        return max1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 3, 4, 7, 57 };

        System.out.println(max(arr));
    }
}

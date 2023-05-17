import java.util.Scanner;

public class Sorted_Roted {

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // kaam
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // on L1
        if (arr[si] <= arr[mid]) {

            // left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // Rigth
                return search(arr, target, mid + 1, ei);
            }
        }

        // on L2
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                // right
                return search(arr, target, mid + 1, ei);
            } else {
                // left
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };

        Scanner sc = new Scanner(System.in);
        System.out.print("enter target : ");
        int target = sc.nextInt();

        int targetIdx = search(arr, target, 0, arr.length -1);

        if(targetIdx == -1){
            System.out.println("Invalid target.... Not include the array");
        }else{

            System.out.println( "Index : " + targetIdx);
        }

        

    }
}

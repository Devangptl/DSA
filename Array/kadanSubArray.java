public class kadanSubArray {

    public static void kadan(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < number.length; i++) {
            curr = curr + number[i];
            if (curr < 0) {
                curr = 0;
            }
            maxSum = Math.max(maxSum, curr);

        }
        System.out.println("our max sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, 5, 78, 54, 4 };
        kadan(number);
    }
}

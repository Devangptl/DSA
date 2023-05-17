public class sumSubArray {

    public static void maxSumSubArray(int number[]) {
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {
                    curr += number[k];
                    System.out.print(number[k] + " ");
                }
                System.out.println(" = " + curr);
                if (maxSum < curr) {
                    maxSum = curr;
                }
                if (minSum > curr) {
                    minSum = curr;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum is : " + maxSum);
        System.out.println("Min Sum is : " + minSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, 5, 78, 54, 4 };
        maxSumSubArray(number);
    }
}

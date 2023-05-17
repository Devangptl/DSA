public class sumSubArray2 {

    public static void maxSumSubArray(int number[]) {
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 0; j < number.length; j++) {
                int end = j;
                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < curr) {
                    maxSum = curr;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, 5, 78, 54, 4 };
        maxSumSubArray(number);
    }
}

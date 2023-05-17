public class subArray {
    public static void printSubarray(int number[]) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                sum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                sum += number[j];
                System.out.println(" = Sum is : " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 4, 6, 8, 7, 56, 90 };
        printSubarray(number);

        // timecomplexity = O(n^3)
    }
}

public class reverse {
    public static void reverse(int number[]) {
        int first = 0;
        int last = number.length - 1;

        while (last > first) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 4, 5, 7, 67, 90 };

        reverse(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        // time complexity = O(n)
        // space complexity = O(1)
    }
}

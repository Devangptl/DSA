public class findSmallest {
    public static int getSmallest(int number[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 67, 54, 89, 34, 56, 12, 48, 97 };
        System.out.println("Smallest number is : " + getSmallest(numbers));
    }
}

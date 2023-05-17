public class lenearSecarch {
    public static int leniarSear(int number[], int key) {
        for (int i = 0; i <= number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 45, 10, 6, 43, 56, 7 };
        int key = 6;

        int index = leniarSear(number, key);
        System.out.println(key + " index number is " + index);

        // time complexity = o(n)
    }
}

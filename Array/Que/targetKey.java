public class targetKey {

    public static boolean checkKey(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                System.out.println(i);
                return true;
            }
        }
        while (true) {
            System.out.println("-1");
            return false;
        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 4, 5, 3, 6, 7 };
        int key = 7;
        checkKey(number, key);

    }
}

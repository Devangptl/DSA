
public class F01 {

    public static void pattern1(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            for (int space = 0; space <= 2 * (n - line); space++) {

                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return;

    }

    public static void pattern2(int n) {
        for (int line = 0; line <= n - 1; line++) {
            for (int star = n - 1; star >= line; star--) {
                System.out.print("*");
            }
            for (int space = 0; space <= line * 2; space++) {
                System.out.print(" ");
            }
            for (int star = n - 1; star >= line; star--) {
                System.out.print("*");
            }

            System.out.println();
        }

        return;

    }

    public static void main(String[] args) {

        pattern1(4);
        pattern2(4);

    }
}

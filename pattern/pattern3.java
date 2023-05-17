
public class pattern3 {

    public static void pattern01(int n) {
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
    }

    public static void pattern02(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = n; star >= line; star--) {
                System.out.print("*");
            }
            for (int space = 2; space <= line * 2; space++) {
                System.out.print(" ");
            }
            for (int star = n; star >= line; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern01(10);
        pattern02(10);
    }
}

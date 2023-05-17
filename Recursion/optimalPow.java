public class optimalPow {

    public static int optimapPower(int n, int i) {
        if (i == 0) {
            return 1;
        }

        int halfPow = optimapPower(n, i / 2);

        int halfPowSqr = halfPow * halfPow;

        // odd
        if (i % 2 != 0) {
            halfPowSqr = n * halfPowSqr;
        }
        return halfPowSqr;
    }

    public static void main(String[] args) {

        int n = 2;
        int i = 5;

        System.out.println(optimapPower(n, i));
    }
}

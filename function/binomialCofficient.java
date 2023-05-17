
import java.util.*;

public class binomialCofficient {

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int binCoffi(int n, int r) {
        int factorial_n = factorial(n);
        int factorial_r = factorial(r);
        int factorial_nmr = factorial(n - r);

        int binCoffi = factorial_n / (factorial_r * factorial_nmr);
        return binCoffi;

    }

    public static void main(String[] args) {

        System.out.println(binCoffi(10, 8));
    }
}
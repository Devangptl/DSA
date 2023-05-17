public class Factorial {

    public static int getFactorial(int n) {

        if (n == 0) {
            return 1;
        }

        int fnm1 = getFactorial(n - 1);
        int fr = n * fnm1;

        return fr;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(getFactorial(n));
    }
}

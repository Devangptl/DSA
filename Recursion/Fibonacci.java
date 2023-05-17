public class Fibonacci {

    public static int getFibonacci(int n) {

        if (n == 1 || n == 0 || n < 0) {
            return n;
        }

        int fnm1 = getFibonacci(n - 1);
        int fnm2 = getFibonacci(n - 2);

        int fibo = fnm1 + fnm2;

        return fibo;
    }

    public static void main(String[] args) {
        int n = -1;
        System.out.println(getFibonacci(n));

        //timecomplexity = O(2^n)
        //spaceComplexity = O(n)
    }
}

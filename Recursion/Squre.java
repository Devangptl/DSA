public class Squre {

    public static int getSqure(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * getSqure(a, n - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 3;

        System.out.println(getSqure(a, n));

        // timecomplexity = O(n)
        // spacecomplexity = O(n)
    }
}

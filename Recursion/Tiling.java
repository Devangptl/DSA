public class Tiling {

    public static int getTiling(int n) {

        if (n == 0 | n == 1) {
            return 1;
        }

        int Fnm1 = getTiling(n - 1);

        int Fnm2 = getTiling(n - 2);

        int sum = Fnm1 + Fnm2;

        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(getTiling(n));
    }
}

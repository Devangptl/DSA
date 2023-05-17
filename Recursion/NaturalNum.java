public class NaturalNum {

    public static int sumNaturalNum(int n) {

        if (n == 1) {
            return 1;
        }
        int Snm1 = sumNaturalNum(n - 1);
        int sum = n + Snm1;

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumNaturalNum(n));
    }
}

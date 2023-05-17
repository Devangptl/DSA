public class Exponentiation {

    public static int FastExponentiation(int number, int power) {

        int ans = 1;

        while (power > 0) {
            if ((power & 1) != 0) {
                ans = ans * number;
            }

            number = number * number;

            power = power >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(FastExponentiation(5, 3));
    }
}

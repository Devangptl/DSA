package Question;

public class Q2 {

    public static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        if (isEven(3)) {
            System.out.println("Number is even");
        } else {
            System.out.println("number is not even");
        }
    }
}

import java.util.Scanner;

public class Problem_2 {

    public static void getIncrNumber(int n) {

        if (n == 1) {
            System.out.print(1);
            return;
        }

        getIncrNumber(n - 1);
        System.out.print(" " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");

        int n = sc.nextInt();
        getIncrNumber(n);
    }
}

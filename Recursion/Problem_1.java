import java.util.Scanner;

public class Problem_1 {

    public static void getDecNum(int n) {

        if (n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        getDecNum(n - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int n = sc.nextInt();

        getDecNum(n);
    }
}
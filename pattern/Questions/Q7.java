package Questions;

import java.util.*;

public class Q7 {
    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= 2 * (n - i); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= n; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        solid_rhombus(number);
    }
}

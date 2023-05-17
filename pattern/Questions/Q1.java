package Questions;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number the line : ");
        int n = sc.nextInt();
        int number = 1;
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}

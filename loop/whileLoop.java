package loop;

import java.util.*;

public class whileLoop {
    public static void main(String args[]) {
        // int number = 1;
        // while (number <= 10) {
        // System.out.println(number);
        // number++;
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int number = 1;
        int sum = 0;
        // while (number <= n) {
        // sum += number;
        // System.out.println(number);
        // number++;
        // }
        // System.out.println("total sum : " + sum);

        do {
            sum += number;
            System.out.println(number);
            number++;
        } while (number <= n);
        System.out.println("total sum : " + sum);
    }
}

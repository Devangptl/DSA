package loop;

import java.util.*;

public class foorLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number  : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}

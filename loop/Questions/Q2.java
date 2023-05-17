package loop.Questions;

import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        long number = sc.nextInt();
        long factorial = 1;
        for (long i = 1; i < number + 1; i++) {
            factorial *= i;
        }
        System.out.println("factorial is " + factorial);
    }
}

package loop;

import java.util.*;

public class example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(n); i++) { // n-1 ki jagah Math.sqrt(n) likhke time complexity kam hoti he
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }

        }
    }
}

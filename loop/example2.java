package loop;

import java.util.Scanner;

public class example2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        long n = sc.nextLong();
        // for (int n = 100245; n > 0;) {
        // int lastDigit = n % 10;
        // System.out.print(lastDigit);
        // n = n / 10;
        // }

        // System.out.print("Reverse n is ");
        // while (n > 0) {
        // long lastDigit = n % 10;
        // System.out.print(lastDigit);
        // n = n / 10;
        // }

        long rev = 0;
        while (n > 0) {
            long lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println("reverse number is " + rev);
    }
}

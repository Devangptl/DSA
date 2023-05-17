package Questions;

import java.util.*;

public class Q9 {
    public static void Diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= (n - i); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            // dushara logic star<=(2*i)-1 likh shakte he

            for (int star = 2; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) { // n-1 ki jagah n bhi likh sakate he
            for (int space = 1; space <= (n - i); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            for (int star = 2; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond(5);
    }
}

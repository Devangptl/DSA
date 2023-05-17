package Conditional.Questions;

import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to check : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not leap year");
                }

            } else {
                System.out.println("leap year");
            }

        } else {
            System.out.println("Not leap year");
        }
    }
}

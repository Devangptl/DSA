package Conditional.Questions;

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("number is Positive");
        } else if (number == 0) {
            System.out.println("Zero is not Positive and Nagative");
        } else {
            System.out.println("number is Nagative");
        }
    }
}

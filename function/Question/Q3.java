package Question;

import java.util.*;

public class Q3 {
    public static boolean isPalindrome(int number) {
        int myNum = number;
        int palindrome = 0;
        int rem;
        while (number > 0) {
            rem = number % 10;
            palindrome = rem + (palindrome * 10);
            number = number / 10;
        }
        if (palindrome == myNum) {
            System.out.println("number is palidrama : " + palindrome);
            return true;
        } else {
            System.out.println("number is not palidrama");
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the number : ");
        int palindrome = sc.nextInt();
        isPalindrome(palindrome);
    }
}

// package Conditional;

// public class ifelse {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 10;
//         int c = 10;
//         if (a > b) {
//             System.out.println("a is largest number");
//         }

//         if (a < c && c > b) {
//             System.out.println("C is largest number");
//         }

//         if (a == b && b == c && a == c) {
//             System.out.println("a , b , c is same number");
//         }

//         else {
//             System.out.println("B is largest number");
//         }
//     }
// }

package Conditional;

import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number Even");
        } else {
            System.out.println("Number Odd");
        }
    }
}
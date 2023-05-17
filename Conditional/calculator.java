package Conditional;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int A = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int B = sc.nextInt();
        System.out.print("Enter the Operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Your value " + (A + B));
                break;
            case '-':
                System.out.println("Your value " + (A - B));
                break;
            case '*':
                System.out.println("Your value " + (A * B));
                break;
            case '/':
                System.out.println("Your value " + (A / B));
                break;
            case '%':
                System.out.println("Your value " + (A % B));
                break;
            default:
                System.out.println("invalid Operator");
                break;
        }
    }
}
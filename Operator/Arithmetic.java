package Operator;

import java.util.*;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A : ");
        int a = sc.nextInt();
        System.out.print("Enter number B : ");
        int b = sc.nextInt();
        int add = a + b;
        int subtraction = a - b;
        int multiple = a * b;
        float division = a / b;
        int modulo = a % b;
        System.out.println("add = " + add);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiple = " + multiple);
        System.out.println("division = " + division);
        System.out.println("modulo = " + modulo);
    }
}

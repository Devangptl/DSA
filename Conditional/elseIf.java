package Conditional;

import java.util.*;

public class elseIf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are is adult");
        } else if (age <= 18 && age >= 13) {
            System.out.println("you are teeneger");
        } else {
            System.out.println("you are is children");
        }
    }
}

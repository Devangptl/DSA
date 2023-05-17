package Conditional;

import java.util.*;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        String ageType = (age >= 18) ? "you can adult" : "you can not adult";
        System.out.println(ageType);
    }
}

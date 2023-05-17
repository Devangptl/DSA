package Conditional;

import java.util.*;

public class incomeTextCalculator {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income : ");
        int income = sc.nextInt();
        int tax;
        double tax1 = 0.2;
        double tax2 = 0.3;
        if (income < 500000) {
            tax = 0;
            System.out.println("tax " + "0% : " + tax);

        } else if (income >= 500000 && income <= 100000) {
            tax = (int) (income * tax1);
            System.out.println("tax " + tax1 + "% : " + tax);
        } else {
            tax = (int) (income * tax2);
            System.out.println("tax " + tax2 + "% : " + tax);
        }
        System.out.println("Your income is : " + (income - tax));
    }
}
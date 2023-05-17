package Question;

import java.util.*;

public class Q4 {

    public static int digitSum(int n) {

        int number = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            number = number + lastDigit;
            n = n / 10;
        }
        return number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int number = sc.nextInt();

        System.out.println(digitSum(number));
    }
}

package loop;

import java.util.*;

public class example3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);

        } while (true);
        System.out.println("i am out the loop");
    }
}

package Conditional;

import java.util.*;

public class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "Choose the item \n1 = Burgar \n2 = Punjabi Thali \n3 = South Indian Thali \nDefault = Gujrati Thali ");
        System.out.print("Choose number : ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Burgar");
                break;
            case 2:
                System.out.println("Punjabi Thali");
                break;
            case 3:
                System.out.println("South Indian Thali");
                break;
            default:
                System.out.println("Gujrati Thali");
        }
    }
}

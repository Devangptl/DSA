import java.util.Scanner;

public class checkEvenOrOdd {

    public static void getEvenOrOdd(int number) {
        int bitMask = 1;

        if ((number & bitMask) == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        getEvenOrOdd(number);

    }
}

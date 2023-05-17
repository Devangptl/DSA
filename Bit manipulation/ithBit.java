import java.util.Scanner;

public class ithBit {

    public static int getithBit(int number, int i) {
        int bitMask = 1 << i;

        if ((number & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.print("Enter the ith position : ");
        int i = sc.nextInt();

        System.out.println(getithBit(number, i));
    }
}

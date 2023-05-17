import java.util.Scanner;

public class setIthBit {

    public static int setithBit(int number, int i) {

        int bitMask = 1 << i;

        return number | bitMask;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.print("Enter the ith position : ");
        int i = sc.nextInt();

        System.out.println(setithBit(number, i));
    }
}

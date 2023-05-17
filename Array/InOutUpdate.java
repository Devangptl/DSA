import java.util.*;

public class InOutUpdate {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first element : ");
        marks[0] = sc.nextInt();
        System.out.print("enter the second element : ");
        marks[1] = sc.nextInt();
        System.out.print("enter the third element : ");
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("maths : " + marks[2]);

        marks[2] = 80;
        marks[1] = marks[1] + 1;
        System.out.println("update maths : " + marks[2]);
        System.out.println("update chem : " + marks[1]);

    }
}

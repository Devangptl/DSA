import java.util.Scanner;

public class concate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter FirstName : ");
        String firstName = sc.nextLine();
        System.out.print("Enter LastName : ");
        String LastName = sc.nextLine();

        String concate = firstName + " " + LastName;

        System.out.println(concate);
    }
}

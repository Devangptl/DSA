import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        if (isPalindrome(str) == true) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
        // System.out.println(isPalindrome(str));

    }
}

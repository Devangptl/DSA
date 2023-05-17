
import java.util.*;

public class function {

    public static void helloWorld() { // void is returnType
        System.out.println("hello world");
        return;
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static int product(int a, int b) {
        int product = a * b;
        System.out.println(product);
        return product;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value b : ");
        int b = sc.nextInt();
        helloWorld();// fuction call
        // sum function call
        sum(a, b);
        // product function call
        product(a, b);
        // factorial function call
        factorial(5);

    }
}

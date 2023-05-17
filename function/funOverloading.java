
public class funOverloading {

    public static int calculater(int a, int b) {
        return a + b;
    }

    public static int calculater(int a, int b, int c) {
        return a * b * c;
    }

    public static int calculater(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(calculater(10, 10));
        System.out.println(calculater(10, 10, 10));
        System.out.println(calculater(10, 10, 10, 10));
    }
}

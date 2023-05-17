package Operator;

public class logical {
    public static void main(String[] args) {
        // two statment true than return => true
        // but statment one true and statment two false than return => false
        // two statment false than return => false
        System.out.println((10 > 9) && (9 > 3));
        System.out.println((10 < 9) && (9 == 9));
        System.out.println((10 < 9) && (9 < 3));

        // two statment true than return => true
        // but statment one true and statment two false than return => false
        // two statment false than return => false
        System.out.println((10 > 9) || (9 > 3));
        System.out.println((10 < 9) || (9 == 9));
        System.out.println((10 < 9) || (9 < 3));

        // true --> false
        // false --> true
        System.out.println(!(10 > 9));
        System.out.println(!(10 < 9));

    }
}

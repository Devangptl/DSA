public class powerOf2 {

    public static boolean checkPower2(int number) {

        return (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {

        System.out.println(checkPower2(8));
    }
}

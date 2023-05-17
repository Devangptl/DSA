public class clearBitInRang {

    public static int ClearBitInRang(int number, int i, int rang) {
        int a = ((~0) << (rang + 1));
        int b = (i << i) - 1;

        int bitMask = a | b;

        return number & bitMask;

    }

    public static void main(String[] args) {

        System.out.println(ClearBitInRang(10, 2, 4));

    }
}

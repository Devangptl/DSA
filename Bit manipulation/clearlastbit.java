public class clearlastbit {

    public static int clearIthBit(int number, int i) {
        int bitMask = (~0) << i; // ~0 = -1

        return number & bitMask;
    }

    public static void main(String[] args) {

        System.out.println(clearIthBit(15, 2));

    }
}

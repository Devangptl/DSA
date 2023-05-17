public class updateIthbit {

    public static int clearIthBit(int number, int i) {
        int bitMask = ~(1 << i);
        return number & bitMask;
    }

    public static int getUpdateNumber(int number, int i, int setBit) {
        number = clearIthBit(number, i);

        int bitMask = setBit << i;

        return number | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(getUpdateNumber(3, 2, 1));
    }
}

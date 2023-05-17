public class CountSetBit {

    public static int countSetBit(int number) {

        int coun = 0;

        while (number > 0) {
            if ((number & 1) != 0) {
                coun++; // check LSB
            }
            number = number >> 1;
        }

        return coun;
    }

    public static void main(String[] args) {

        System.out.println(countSetBit(5));

    }
}

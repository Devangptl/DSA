public class binaryToDecimal {

    public static void bTOd(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(myNum + " decimal is : " + decNum);

    }

    public static void main(String[] args) {
        bTOd(101);
    }
}

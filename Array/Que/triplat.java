import java.util.*;

public class triplat {

    public static void checkTriplat(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        List<Integer> array = new ArrayList<Integer>();
                        array.add(number[i]);
                        array.add(number[j]);
                        array.add(number[k]);

                        // System.out.println(number[i]);
                        // System.out.println(number[j]);
                        // System.out.println(number[k]);
                        System.out.println(array);

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int number[] = { -1, 0, 1, 2, -1, -4 };
        checkTriplat(number);
    }
}

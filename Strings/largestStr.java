public class largestStr {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };

        String largestStr = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if (largestStr.compareTo(fruits[i]) < 0) {
                largestStr = fruits[i];
            }
        }
        System.out.println(largestStr);
    }
}

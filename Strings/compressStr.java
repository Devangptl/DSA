public class compressStr {

    public static String Compress(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer counter = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
            }

            sb.append(str.charAt(i));

            if (counter > 1) {
                sb.append(counter);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbrrrrddesdwffftgg";
        System.out.println(Compress(str));

    }
}

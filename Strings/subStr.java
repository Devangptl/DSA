public class subStr {

    public static String getSubStr(String str, int si, int ei) {
        String substring = "";

        for (int i = si; i < ei; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }

    public static void main(String[] args) {
        String str = "DevangPatel";

        // inbuild subString sunction

        String substr = str.substring(0, 6);
        System.out.println(substr);

        System.out.println(getSubStr(str, 0, 6));
    }
}

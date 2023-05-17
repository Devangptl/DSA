public class compareStr {
    public static void main(String[] args) {
        String str = "Devang";
        String str1 = "Devang";
        String str2 = new String("Devang");

        if (str == str1) {
            System.out.println("String is match");
        } else {
            System.out.println("not Match");
        }

        if (str == str2) {
            System.out.println("String is Match");
        } else {
            System.out.println("String is not match");
        }

        // function for the String Match ---> this use the compare String

        if (str.equals(str2)) {
            System.out.println("String match");
        } else {
            System.out.println("not match");
        }
    }
}

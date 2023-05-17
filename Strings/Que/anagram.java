package Que;

import java.util.*;

public class anagram {

    public static void getAnagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        boolean status = true;

        if (str1.length() != str2.length()) {

            status = false;

        } else {

            char char1[] = str1.toLowerCase().toCharArray();
            char char2[] = str2.toLowerCase().toCharArray();

            Arrays.sort(char1);

            Arrays.sort(char2);

            status = Arrays.equals(char1, char2);

        }
        if (status) {
            System.out.println("STRINGS ARE ANAGRAMS");
        } else {
            System.out.println("STRINGS ARE NOT ANAGRAMS");
        }

    }

    public static void main(String[] args) {
        String str1 = "dev si me";
        String str2 = "iv dm es e";
        getAnagram(str1, str2);
    }
}

import java.util.*;

public class funArgs {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 85, 68, 99 };
        update(marks);

        // print update marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(" update marks : " + marks[i]);
        }
        System.out.println();
    }
}

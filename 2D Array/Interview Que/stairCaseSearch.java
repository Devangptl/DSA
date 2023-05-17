import java.util.Scanner;

public class stairCaseSearch {

    public static boolean searchKey(int matrix[][], int key) {

        // int row = 0;
        // int col = matrix[0].length - 1; ----> this is (0,matrix[0].length -1) index
        // mate

        int row = matrix.length - 1;
        int col = 0;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("key found at : (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                col++;
            } else if (key < matrix[row][col]) {
                row--;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };

        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        searchKey(matrix, key);
    }
}
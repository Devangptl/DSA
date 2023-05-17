import java.util.Scanner;

public class create2Darray {

    public static void searchIndex(int matrix[][], int key) {

        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == maxElement) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];

        int row = matrix.length;
        int column = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
                // System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }

        System.out.print("Enter key : ");
        int key = sc.nextInt();

        searchIndex(matrix, key);
    }
}
import java.util.Scanner;

import javax.crypto.Mac;

public class MaxMin {

    public static void MaxMinElementSearch(int matrix[][]) {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];

                }

                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }
        System.out.println("Max number is : " + maxElement);
        System.out.println("Min number is : " + minElement);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the element : ");

        int matrix[][] = new int[3][3];

        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        MaxMinElementSearch(matrix);
    }
}

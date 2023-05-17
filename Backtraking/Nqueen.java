import java.util.Scanner;

public class Nqueen {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 & j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal rigth
        for (int i = row - 1, j = col + 1; i >= 0 & j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            count++;
            System.out.println("---- board " + count + "----");
            printBoard(board);
            return;
        }
        // column loop

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1); // Function call
                board[row][j] = 'X'; // Backtraking call
            }
        }
    }

    // only one solution print .........


    // public static boolean nQueen(char board[][], int row) {
    // // base case
    // if (row == board.length) {
    // count++;
    // System.out.println("---- board " + count + "----");
    // printBoard(board);
    // return true;
    // }
    // // column loop

    // for (int j = 0; j < board.length; j++) {
    // if (isSafe(board, row, j)) {
    // board[row][j] = 'Q';
    // if (nQueen(board, row + 1)) {
    // return true;
    // } // Function call
    // board[row][j] = 'X'; // Backtraking call
    // }
    // }
    // return false;
    // }

    public static void printBoard(char board[][]) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter find the number of nQueen problem Solution : ");

        int n = sc.nextInt();
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        if (n <= 3) {
            System.out.println("Not possible Solution");
        } else {
            nQueen(board, 0);
        }

        // only one solution print .........

        // if (nQueen(board, 0)) {

        // } else {
        // System.out.println("Solution is not possible");
        // }

        // TimeCoomplexity = O(n!)

    }
}

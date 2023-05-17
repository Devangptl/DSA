import java.util.Scanner;

public class GridWays {

    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        // recursion
        // down
        int w1 = gridWays(i + 1, j, n, m);
        // rigth
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int n = sc.nextInt();
        System.out.print("Enter Column : ");
        int m = sc.nextInt();

        System.out.println("Total ways : " + gridWays(0, 0, n, m));

    }
}

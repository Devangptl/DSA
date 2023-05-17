public class Q2 {

    public static int sumOfSelectedRow(int matrix[][], int index) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[index][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int index = 1;
        System.out.println(sumOfSelectedRow(matrix, index));
    }
}

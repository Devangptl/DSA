public class Q1 {

    public static int searchNum(int matrix[][], int key) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 4;

        System.out.println(searchNum(matrix, key));

    }
}
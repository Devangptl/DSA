public class transpose {

    public static void transpose2Darray(int matrix[][]) {

        for (int i = 0; i < matrix.length + 1; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
                // System.out.print(i + "," + j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int matrix[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
        transpose2Darray(matrix);
    }
}

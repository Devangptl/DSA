public class hollowRectengle {
    public static void hollow_rectengle(int row, int colm) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= colm; j++) {
                if (i == 1 || i == row || j == 1 || j == colm) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectengle(10, 10);
    }
}

package tasks.task4;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{5,2,1},{3,9,8},{5,7,3}};
        print(matrix);
    }
    public static void print(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------------------");
        int[][] altMatrix = matrix;
        int matrixLength = matrix.length;

        for(int i = 0; i < matrixLength; ++i) {
            int[] row = altMatrix[i];
            int[] altRow = row;
            int rowLength = row.length;

            for(int j = 0; j < rowLength; ++j) {
                int item = altRow[j];
                System.out.print(item);
            }

            System.out.println();
        }
    }
}

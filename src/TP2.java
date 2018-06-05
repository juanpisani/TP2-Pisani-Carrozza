public class TP2 {

    public static int[][] sum(int[][] matrixA, int[][] matrixB){
        int[][] sum = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sum;
    }

    public static int[] productBandMatrixAndVector(int[][] matrix, int[]vector){
        int[] result = new int[vector.length];
        int n = vector.length;
        int bands = (n - 2)*2 + 3;

        for (int i = 0; i < bands / 2 + 1; i++) {
            if (matrix[0][n - i - 1] != 0){
                int fila = n - 1 - i;
                for (int j = 0; j < i + 1; j++) {
                    result[fila] += matrix[j][fila] * vector[j];
                    fila++;
                }
            }
        }

        for (int i = 1 ; i < bands / 2 + 1; i++) {
            if (matrix[n - 1][n - 1 - i] != 0){
                int fila = n - 1 -i;
                for (int j = n - 1; j > i - 1 ; j--) {
                    result[fila] += matrix[j][fila] * vector[j];
                    fila--;
                }
            }
        }
        return result;
    }
}

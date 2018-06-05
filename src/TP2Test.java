import org.junit.Test;

import static org.junit.Assert.*;

public class TP2Test {

    @Test
    public void test01_sum(){
        int[][] matrixA = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] matrixResult = new int[][]{{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        assertArrayEquals(matrixResult, TP2.sum(matrixA, matrixB));
    }

    @Test
    public void test01_productWithVector(){
        int[][] matrixA = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] vector = new int[]{1, 2, 3};
        int[] result = new int[]{30, 36, 42};
        assertArrayEquals(result, TP2.productBandMatrixAndVector(matrixA, vector));

        int[][] matrixB = new int[][]{{1, 2, 0}, {0, 5, 6}, {0, 0, 9}};
        int[] vectorB = new int[]{1, 2, 3};
        int[] resultB = new int[]{1, 12, 39};
        assertArrayEquals(resultB, TP2.productBandMatrixAndVector(matrixB, vectorB));
    }

}
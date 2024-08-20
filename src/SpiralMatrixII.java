import java.util.Arrays;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int num = 1;
        int[][] matrix = new int[n][n];
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int j = colStart; j <= colEnd; j++) {
                matrix[rowStart][j] = num++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd--;
            if (rowEnd < rowStart || colEnd < colStart)
                break;
            for (int j = colEnd; j >= colStart; j--) {
                matrix[rowEnd][j] = num++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                matrix[i][colStart] = num++;
            }
            colStart++;
        }
        return matrix;
    
    }
}
//59. Spiral Matrix II
//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
//
//
//
//        Example 1:
//
//
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
//Example 2:
//
//Input: n = 1
//Output: [[1]]
//
//
//Constraints:
//
//        1 <= n <= 20

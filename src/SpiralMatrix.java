import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return ans;
        }

        int m = matrix.length, n = matrix[0].length;
        int rowStart = 0, rowEnd = m - 1, colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int j = colStart; j <= colEnd; j++) {
                ans.add(matrix[rowStart][j]);
            }
            ++rowStart;

            for (int i = rowStart; i <= rowEnd; i++) {
                ans.add(matrix[i][colEnd]);
            }
            --colEnd;

            if (rowStart > rowEnd || colStart > colEnd) {
                break;
            }

            for (int j = colEnd; j >= colStart; j--) {
                ans.add(matrix[rowEnd][j]);
            }
            --rowEnd;

            for (int i = rowEnd; i >= rowStart; i--) {
                ans.add(matrix[i][colStart]);
            }
            ++colStart;

        }
        return ans;
    }

    public static void main(String[] args) {
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println(Arrays.asList(spiralOrder(arr)));
    }
}
//54. Spiral Matrix
//Given an m x n matrix, return all elements of the matrix in spiral order.
//
//
//
//Example 1:
//
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
//Example 2:
//
//
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
//
//
//Constraints:
//
//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 10
//        -100 <= matrix[i][j] <= 100

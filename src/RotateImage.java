import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix, i, j);
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                swapRow(matrix, i, start, end);
                start++;
                end--;
            }
        }
    }
    public static void swapRow(int arr[][], int i, int start, int end) {
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;
    }
    public static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        rotate(arr);
        System.out.println("After Sorting 1");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
//48. Rotate Image
//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//
//
//
//Example 1:
//
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]
//Example 2:
//
//
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
//
//
//Constraints:
//
//n == matrix.length == matrix[i].length
//1 <= n <= 20
//        -1000 <= matrix[i][j] <= 1000
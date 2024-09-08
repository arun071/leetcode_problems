import java.util.Arrays;

public class Convert1DArrayInto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length)
            return new int[][]{};
        int num = 0;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[num++];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[][]{}));
    }
}
//2022. Convert 1D Array Into 2D Array
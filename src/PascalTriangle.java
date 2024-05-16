import java.util.ArrayList;
import java.util.List;
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    rows.add(1);
                } else {
                    List<Integer> previousRow = ans.get(i - 1);
                    rows.add(previousRow.get(j) + previousRow.get(j - 1));
                }
            }
            ans.add(rows);
        }
        return ans;
    }
}
//118. Pascal's Triangle
//    Given an integer numRows, return the first numRows of Pascal's triangle.
//
//        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//
//
//
//        Example 1:
//
//        Input: numRows = 5
//        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//        Example 2:
//
//        Input: numRows = 1
//        Output: [[1]]
//
//
//        Constraints:
//
//        1 <= numRows <= 30
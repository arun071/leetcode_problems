import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
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
        List<Integer> rowIndexList = ans.get(rowIndex);
        return rowIndexList;

    }


}
//119. Pascal's Triangle II
//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//
//        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//
//
//
//        Example 1:
//
//        Input: rowIndex = 3
//        Output: [1,3,3,1]
//        Example 2:
//
//        Input: rowIndex = 0
//        Output: [1]
//        Example 3:
//
//        Input: rowIndex = 1
//        Output: [1,1]
//
//
//        Constraints:
//
//        0 <= rowIndex <= 33

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        perumations(nums,0,new boolean[nums.length],new ArrayList<>(),result);
        return result;
    }

    public static void perumations(int[] nums, int start, boolean[] selected, List<Integer> currentList, List<List<Integer>> ans) {
        if (currentList.size() == nums.length) {
            ans.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!selected[i]) {
                selected[i] = true;
                currentList.add(nums[i]);
                perumations(nums, start + 1, selected, currentList, ans);
                selected[i] = false;
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}
//46. Permutations
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
//
//
//
//        Example 1:
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//Example 2:
//
//Input: nums = [0,1]
//Output: [[0,1],[1,0]]
//Example 3:
//
//Input: nums = [1]
//Output: [[1]]
//
//
//Constraints:
//
//        1 <= nums.length <= 6
//        -10 <= nums[i] <= 10
//All the integers of nums are unique.
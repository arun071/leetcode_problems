import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrayII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> List = new ArrayList<>();
        for (int val : nums1) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else
                map.put(val, 1);
        }
        for (int val : nums2) {
            if (map.containsKey(val) && map.get(val) > 0) {
                List.add(val);
                map.put(val, map.get(val) - 1);
            }
        }
        int ans[] = new int[List.size()];
        for (int i = 0; i < List.size(); i++) {
            ans[i] = List.get(i);
        }
        return ans;
    }
}

//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//
//
//
//        Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Explanation: [9,4] is also accepted.
//
//
//        Constraints:
//
//        1 <= nums1.length, nums2.length <= 1000
//        0 <= nums1[i], nums2[i] <= 1000
//
//
//Follow up:
//
//What if the given array is already sorted? How would you optimize your algorithm?
//What if nums1's size is small compared to nums2's size? Which algorithm is better?
//What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
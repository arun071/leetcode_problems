import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                k += 1;
                nums[i] = 0;
            } else {
                map.put(nums[i], i);
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;

    }
}

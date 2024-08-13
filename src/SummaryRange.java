import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRange {
    public static List<String> summaryRanges(int[] nums) {
        int start = nums[0];
        List<String> Ans = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]-1) {
                if (start == nums[i - 1])
                    Ans.add(String.valueOf(start));
                else
                    Ans.add(start + "->" + nums[i-1]);
            }
            start = nums[i];

        }
        if (start == nums[nums.length - 1])
            Ans.add(String.valueOf(start));
        else
            Ans.add(start + "->" + nums[nums.length-1]);

        return Ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(Arrays.toString(arr));
//        int[] arr = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(arr));
    }
}

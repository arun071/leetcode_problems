import java.util.List;

public class CountPairsWhoseSumIsLessthanTarget {
    public int countPairs(List<Integer> nums, int target) {
        int ans=0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i)+nums.get(j)<target)
                    ans++;
            }
        }
        return ans;
    }
}

//2824. Count Pairs Whose Sum is Less than Target
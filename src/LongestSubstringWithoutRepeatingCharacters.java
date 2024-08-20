import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)) {
                if (start <= map.get(ch)) {
                    start = map.get(ch) + 1;
                }
            }
            len = Math.max(len, end - start + 1);
            map.put(ch, end);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,1,2};
        System.out.println(rob(arr));
//        System.out.println(lengthOfLongestSubstring("abcdabc"));
    }
}
//3. Longest Substring Without Repeating Characters
//
//Given a string s, find the length of the longest
//        substring
//without repeating characters.
//
//
//
//        Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//        Constraints:
//
//        0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.
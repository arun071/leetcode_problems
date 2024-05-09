import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> mymap = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedStr = String.valueOf(arr);
            if (!mymap.containsKey(sortedStr)) {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                mymap.put(sortedStr, temp);
            } else {
                mymap.get(sortedStr).add(s);
            }
        }
        ans.addAll(mymap.values());
        return ans;
    }

    public static void main(String[] args) {
        String arr[] = {"cat", "bat", "eat", "ate"};
        System.out.println(groupAnagrams(arr));
    }
}
//49.Group Anagrams
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//        Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Example 2:
//
//Input: strs = [""]
//Output: [[""]]
//Example 3:
//
//Input: strs = ["a"]
//Output: [["a"]]
//
//
//Constraints:
//
//        1 <= strs.length <= 104
//        0 <= strs[i].length <= 100
//strs[i] consists of lowercase English letters.

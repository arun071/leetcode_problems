import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String word) {
        String arr[] = word.split(" ");
        if (pattern.length() != arr.length)
            return false;
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char ch = pattern.charAt(i);
            String w = arr[i];

            if (!wordMap.containsKey(w) && !patternMap.containsKey(ch)) {
                wordMap.put(w, ch);
                patternMap.put(ch, w);
            } else {
                if (w.equals(patternMap.get(ch)) || ch != wordMap.get(w)) {

                    return false;
                }
            }
        }

        return true;
    }

}

//290. Word Pattern
//Given a pattern and a string s, find if s follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//
//
//
//Example 1:
//
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Example 2:
//
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false
//
//
//Constraints:
//
//        1 <= pattern.length <= 300
//pattern contains only lower-case English letters.
//        1 <= s.length <= 3000
//s contains only lowercase English letters and spaces ' '.
//s does not contain any leading or trailing spaces.
//All the words in s are separated by a single space.

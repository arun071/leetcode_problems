public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int c : s.toCharArray()) {
            if (c > 64 && c < 91) {
                str.append((char) (c + 32));
            } else if (c > 96 && c < 123) {
                str.append((char) (c));
            } else if (c > 47 && c < 58) {
                str.append((char) (c));
            }
        }
        String ques = str.toString();
        int start = 0;
        int end = ques.length() - 1;
        while (start < end) {
            if (ques.charAt(start) == ques.charAt(end)) {
                start++;
                end--;
            } else
                return false;
        }
        return true;
    }
}
//125. Valid Palindrome
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//        Example 3:
//
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.
//
//
//        Constraints:
//
//        1 <= s.length <= 2 * 105
//        s consists only of printable ASCII characters.

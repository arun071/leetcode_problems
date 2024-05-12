public class ToLowerCase {
    public static String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int ascii = ch[i];
            if (ascii > 64 && ascii < 91)
                ch[i] = (char) (ascii + 32);
        }
        return String.valueOf(ch);
    }
}

//709. To Lower Case
//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
//
//
//
//Example 1:
//
//Input: s = "Hello"
//Output: "hello"
//Example 2:
//
//Input: s = "here"
//Output: "here"
//Example 3:
//
//Input: s = "LOVELY"
//Output: "lovely"
//
//
//Constraints:
//
//        1 <= s.length <= 100
//s consists of printable ASCII characters.
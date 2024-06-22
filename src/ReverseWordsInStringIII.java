public class ReverseWordsInStringIII {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.insert(0, s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
//557. Reverse Words in a String III
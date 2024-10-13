import java.util.HashSet;

public class Consistant {
    public static boolean helper(String str, boolean[] arr) {
        for (char c : str.toCharArray()) {
            if (!arr[c-97]) {
                return false;
            }
        }
        return true;
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean[] arr = new boolean[26];
        for (char c : allowed.toCharArray()) {
            arr[c - 97] = true;
        }
        for (String str : words) {
            if (helper(str, arr))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}

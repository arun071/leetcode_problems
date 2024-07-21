import java.util.Arrays;

public class ReverseWordsInStringIII {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = s.split(" ");
        for (String word : arr) {
            sb.append(revStr(word + " "));
        }
        return sb.toString().trim();
    }

    private static String revStr(String word) {
        char[] arr = word.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Mr Ding"));
    }
}
//557. Reverse Words in a String III
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferentWayToAddParanthesis {
    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        if (expression.length() == 0) return ans;
        if (expression.length() == 1) {
            ans.add(Integer.parseInt(expression));
            return ans;
        }
        if (expression.length() == 2 && Character.isDigit(expression.charAt(0))) {
            ans.add(Integer.parseInt(expression));
            return ans;
        }
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch))
                continue;
            List<Integer> left = diffWaysToCompute(expression.substring(0, i));
            List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
            for (int l : left) {
                for (int r : right) {
                    int result = 0;
                    switch (ch) {
                        case '+':
                            result = l + r;
                            break;
                        case '-':
                            result = l - r;
                            break;
                        case '*':
                            result = l * r;
                            break;
                    }
                    ans.add(result);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       String str="1.2.3.";
       String[] arr=str.split("2");
        System.out.println(Arrays.toString(arr));
    }
}

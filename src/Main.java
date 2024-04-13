import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 5};
        int result[] = TwoSum.twoSum(arr, 3);
        System.out.println(Arrays.toString(result));
    }
}
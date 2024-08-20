public class CheckifArrayIsSortedandRotated {
    public static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) count++;
        }
        if (nums[nums.length - 1] > nums[0]) count++;
        return count <= 1;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        System.out.println(check(arr));
    }
}

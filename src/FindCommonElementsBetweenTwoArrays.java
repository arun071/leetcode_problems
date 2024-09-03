import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElementsBetweenTwoArrays {
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int a = 0;
        int b = 0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
            if (set1.contains(num))
                b++;
        }

        for (int num : nums1) {
            if (set2.contains(num))
                a++;
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIntersectionValues(new int[]{2, 3, 2}, new int[]{1, 2})));
    }
}
//Find Common Elements Between Two Arrays
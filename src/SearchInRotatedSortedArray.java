public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int minIndex = findMinIndex(nums);
        int ans = binarySearch(nums, minIndex, nums.length - 1, target);
        if (ans == -1)
            ans = binarySearch(nums, 0, minIndex - 1, target);
        return ans;
    }

    public int findMinIndex(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[right])
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public int binarySearch(int arr[], int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

}
//33. Search in Rotated Sorted Array
//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1
//
//
//Constraints:
//
//        1 <= nums.length <= 5000
//        -104 <= nums[i] <= 104
//All values of nums are unique.
//nums is an ascending array that is possibly rotated.
//-104 <= target <= 104

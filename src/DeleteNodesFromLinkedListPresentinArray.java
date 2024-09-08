import java.util.HashSet;

public class DeleteNodesFromLinkedListPresentinArray {

    public static ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        ListNode ans = new ListNode(0, head);
        ListNode pointer = ans;
        for (int num : nums)
            set.add(num);
        while (pointer.next != null) {
            if (set.contains(pointer.next.val))
                pointer.next = pointer.next.next;
            else
                pointer = pointer.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int[] nums = {1, 2, 3};
        ListNode ans = modifiedList(nums, root);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
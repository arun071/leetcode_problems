public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int num = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            num += 1;
        }
        current.next = head;
        k = k % num;

        int steps = num - k;
        ListNode tail = current;
        while (steps-- > 0) {
            tail = tail.next;
        }
        ListNode newhead = tail.next;
        tail.next = null;
        return newhead;
    }
}
//step 1 find last node
//step 2 last next head make it circular
//step 3 reduce k
//step 4 finds steps by length - k and new tail node = current
//step 5 while loops in steps end of loop new head =tail.next and tail.next =null to break the loop
//step6 return new head;

//61. Rotate List
//Given the head of a linked list, rotate the list to the right by k places.
//
//
//
//        Example 1:
//
//
//        Input: head = [1,2,3,4,5], k = 2
//        Output: [4,5,1,2,3]
//        Example 2:
//
//
//        Input: head = [0,1,2], k = 4
//        Output: [2,0,1]
//
//
//        Constraints:
//
//        The number of nodes in the list is in the range [0, 500].
//        -100 <= Node.val <= 100
//        0 <= k <= 2 * 109

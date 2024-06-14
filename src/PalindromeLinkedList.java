public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode secondhalf = revList(findMid(head));
        ListNode firsthalf = head;
        while (secondhalf != null) {
            if (firsthalf.val != secondhalf.val) {
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }

    public ListNode revList(ListNode l1) {
        ListNode pre = null;
        ListNode current = l1;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public ListNode findMid(ListNode l1) {
        ListNode fast = l1;
        ListNode slow = l1;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
//234. Palindrome Linked List
//Given the head of a singly linked list, return true if it is a
//        palindrome
//or false otherwise.
//
//
//
//        Example 1:
//
//
//Input: head = [1,2,2,1]
//Output: true
//Example 2:
//
//
//Input: head = [1,2]
//Output: false
//
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 105].
//        0 <= Node.val <= 9
//
//
//Follow up: Could you do it in O(n) time and O(1) space?
public class MiddleElementOfLL {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Advance fast pointer by two steps and slow pointer by one step
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4, new ListNode(5)))));
        ListNode ans = middleNode(l1);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
//876. Middle of the Linked List
//Given the head of a singly linked list, return the middle node of the linked list.
//
//If there are two middle nodes, return the second middle node.
//
//
//
//Example 1:
//
//
//Input: head = [1,2,3,4,5]
//Output: [3,4,5]
//Explanation: The middle node of the list is node 3.
//Example 2:
//
//
//Input: head = [1,2,3,4,5,6]
//Output: [4,5,6]
//Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
//
//
//        Constraints:
//
//The number of nodes in the list is in the range [1, 100].
//        1 <= Node.val <= 100
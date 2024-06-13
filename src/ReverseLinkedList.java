public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
           next=current.next;
           current.next=previous;
           previous=current;
           current=next;
        }
        head = previous;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        while (l1 != null) {
            System.out.print(l1.val + "->");
            l1 = l1.next;
        }
        System.out.print("null");
        ListNode ans = reverseList(l1);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
//206. Reverse Linked List
//Given the head of a singly linked list, reverse the list, and return the reversed list.
//
//
//
//        Example 1:
//
//
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
//Example 2:
//
//
//Input: head = [1,2]
//Output: [2,1]
//Example 3:
//
//Input: head = []
//Output: []
//
//
//Constraints:
//
//The number of nodes in the list is the range [0, 5000].
//        -5000 <= Node.val <= 5000
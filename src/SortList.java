public class SortList {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right = sortList(right);
        return merge(left, right);
    }

    public static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;

        }
        if (left != null)
            current.next = left;
        else if (right != null)
            current.next = right;
        return dummy.next;
    }

    private static ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null) {
            return null;
        }
        while (fast.next != null && fast.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void printNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));
        System.out.println("before");
        printNode(head);
        head = sortList(head);
        System.out.println("after");
        printNode(head);
    }
}
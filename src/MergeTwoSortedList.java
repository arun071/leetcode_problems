class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 != null ? l1 : l2;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode dummListNode = mergeTwoLists(l1, l2);
        ListNode tempListNode = dummListNode;
        while (tempListNode != null) {
            System.out.println(tempListNode.val);
            tempListNode = dummListNode.next;
            dummListNode = dummListNode.next;
        }
    }
}

//21. Merge Two Sorted Lists
//You are given the heads of two sorted linked lists list1 and list2.
//
//        Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//        Return the head of the merged linked list.
//
//
//
//        Example 1:
//
//
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//        Example 2:
//
//        Input: list1 = [], list2 = []
//        Output: []
//        Example 3:
//
//        Input: list1 = [], list2 = [0]
//        Output: [0]
//
//
//        Constraints:
//
//        The number of nodes in both lists is in the range [0, 50].
//        -100 <= Node.val <= 100
//        Both list1 and list2 are sorted in non-decreasing order.

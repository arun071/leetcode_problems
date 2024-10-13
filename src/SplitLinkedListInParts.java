public class SplitLinkedListInParts {
    public static ListNode[] splitListToParts(ListNode root, int k) {
        int length = 0;
        ListNode current = root;
        while (current != null) {
            length++;
            current = current.next;
        }
        current = root;

        int partSize = length / k;
        int extraNodes = length % k;
        ListNode[] result = new ListNode[k];

        for (int i = 0; i < k; i++) {
            int currListLength = partSize + ((extraNodes > 0) ? 1 : 0);
            extraNodes--;

            if (current != null) {
                result[i] = current;
                for (int j = 1; j < currListLength; j++) {
                    current = current.next;
                }


                ListNode nextNode = current.next;
                current.next = null;
                current = nextNode;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10))))))))));

        ListNode[] arr = splitListToParts(node, 3);

        for (ListNode curr : arr) {
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
            System.out.println("");
        }
    }
}
//725. Split Linked List in Parts
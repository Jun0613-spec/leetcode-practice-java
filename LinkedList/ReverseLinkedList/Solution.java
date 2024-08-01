package LinkedList.ReverseLinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
     public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Input: [1, 2, 3, 4, 5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode reversedHead1 = solution.reverseList(head1);
        printList(reversedHead1); // Output: [5, 4, 3, 2, 1]

        // Example 2: Input: [1, 2]
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        ListNode reversedHead2 = solution.reverseList(head2);
        printList(reversedHead2); // Output: [2, 1]

        // Example 3: Input: []
        ListNode head3 = null;

        ListNode reversedHead3 = solution.reverseList(head3);
        printList(reversedHead3); // Output: []
    }

    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       

       while(curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }

        return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
            if (current != null) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    
    
}

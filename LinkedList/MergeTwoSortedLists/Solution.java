package LinkedList.MergeTwoSortedLists;

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

        // Example 1: Input: [1, 2, 4], [1, 3, 4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        printList(mergedList1); // Output: [1, 1, 2, 3, 4, 4]

        // Example 2: Input: [], []
        ListNode list3 = null;
        ListNode list4 = null;

        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        printList(mergedList2); // Output: []

        // Example 3: Input: [], [0]
        ListNode list5 = null;

        ListNode list6 = new ListNode(0);

        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        printList(mergedList3); // Output: [0]
    }

    //Time O(m + n)
    //Space O(m + n)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(list1 != null && list2 != null) {

            if(list1.val < list2.val) {
              curr.next = list1;
              list1 = list1.next;
            } else {
              curr.next = list2;
              list2 = list2.next;
            }
            
            curr = curr.next;
        }

        curr.next = list1 != null ? list1 : list2;
       
        return dummy.next;
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

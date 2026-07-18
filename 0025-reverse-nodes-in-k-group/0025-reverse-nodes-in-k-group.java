/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int size(ListNode list) {
        int size = 0;
        while (list != null) {
            size++;
            list = list.next;
        }
        return size;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        if (k == 1) {
            return head;
        }

        int remaining = size(head);

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prevGroup = dummy;
        ListNode grpStart = head;

        while (remaining >= k) {

            // reverse k nodes after prevGroup
            ListNode prev = null;
            ListNode curr = grpStart;

            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            remaining -= k;

            // move prevGroup to the tail of the reversed group
            prevGroup.next = prev;
            grpStart.next = curr;
            prevGroup = grpStart;
            grpStart = curr;
        }

        return dummy.next;
    }
}
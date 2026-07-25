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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        while (head != null) {
            int val = head.val;
            if (!set.contains(val)) {
                set.add(val);
                prev = head;
                head = head.next;
            } else {
                prev.next = head.next;
                head = head.next;
            }
        }

        return dummy.next;
    }
}
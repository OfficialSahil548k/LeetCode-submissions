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
    public int getSize(ListNode head) {
    int size = 0;

    while (head != null) {
        size++;
        head = head.next;
    }

    return size;
}
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        int n = getSize(head);
        ListNode temp = head;
        for(int i=0; i<n/2-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
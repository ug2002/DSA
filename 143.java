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
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHalfHead = reverse(slow.next);
        slow.next = null;
        while(head!=null && secondHalfHead !=null){
            ListNode temp1 = head.next;
            ListNode temp2 = secondHalfHead.next;
            secondHalfHead.next = head.next;
            head.next = secondHalfHead;
            head = temp1;
            secondHalfHead = temp2;
        }
    }
    public ListNode reverse(ListNode n){
        ListNode prev = null;
        ListNode curr = n;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    // 1->2
    // 5->4->3
}

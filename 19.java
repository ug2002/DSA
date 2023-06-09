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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        if(n==count){
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return head;
        }
        int m = count - n;
        if(m==0)return null;
        ListNode prev = head;
        int i =1;
        while(i !=m){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}

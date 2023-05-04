class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode start = head;
        ListNode prev = null;
        while(start!=null){
            ListNode temp = start.next;
            start.next = prev;
            prev = start;
            start = temp;
        }
        return prev;
    }
}

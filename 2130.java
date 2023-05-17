class Solution {
    public int pairSum(ListNode head) {
        ListNode curr = head;
        int len =0;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        int [] arr = new int[len];
        int i=0;
        curr = head;
        while(curr!=null){
            arr[i] = curr.val;
            i++;
            curr = curr.next;
        }
        int l=0, r=len-1;
        int ans =0;
        while(l<=r){
            ans = Math.max(ans, arr[l] + arr[r]);
            l++;
            r--;
        }
        return ans;
    }
}

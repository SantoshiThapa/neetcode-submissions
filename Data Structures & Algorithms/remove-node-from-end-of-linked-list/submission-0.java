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
        ListNode t=head;
        int c=0;
        if(head==null)
        return head;
        while(t!=null){
        c++;
        t=t.next;
    }
    int r=c-n;
    if(r==0)
    return head.next;
    t=head;
    ListNode p=null;
    for(int i=0;i<r;i++){
    p=t;
    t=t.next;
    }
    p.next=t.next;
    return head;
    }
}

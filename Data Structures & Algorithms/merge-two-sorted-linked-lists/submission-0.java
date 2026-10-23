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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a=l1,b=l2;
        ListNode m=new ListNode(0);
        ListNode d=m;
        while(a!=null && b!= null){
            if(a.val<b.val){
            d.next=a;
            a=a.next;
            }
            else{
                d.next=b;
                b=b.next;
            }
            d=d.next;
        }
        d.next=(a!=null)?a:b;
        return m.next;
    }
}
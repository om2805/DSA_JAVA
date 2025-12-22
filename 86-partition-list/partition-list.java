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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode();
        ListNode right=new ListNode();
        ListNode cur=head;
        ListNode lcur=left;
        ListNode rcur=right;
        while(cur!=null){
            if(cur.val<x){
                lcur.next= new ListNode(cur.val);
                lcur=lcur.next;
            }
            else{
                rcur.next=new ListNode(cur.val);
                rcur=rcur.next;
            }
            cur=cur.next;
        }
        lcur.next=right.next;
        return left.next;
    }
}
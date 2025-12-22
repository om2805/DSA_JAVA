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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp=head;
        int cnt=1;
        while(temp.next!=null) {
            cnt++;
            temp=temp.next;
        }
        temp.next=head;
        int i=1;
        k=cnt - k%cnt;
        temp=head;
        while(i<k){
            temp=temp.next;
            i++;
        }
        head=temp.next;
        temp.next=null;   
        return head;
    }
}
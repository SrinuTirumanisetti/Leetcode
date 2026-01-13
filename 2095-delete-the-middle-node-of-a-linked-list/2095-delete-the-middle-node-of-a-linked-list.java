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
    public ListNode deleteMiddle(ListNode head) {
        // if(head.next==null){
        //     return null;
        // }
        // ListNode p1=head;
        // ListNode p2=head;
        // int count=0;
        // while(p1!=null){
        //     count++;            
        //     p1=p1.next;
        // }
        // int middle=count/2;
        // for(int i=0;i<middle-1;++i){
        //     p2=p2.next;
        // }
        // p2.next=p2.next.next;
        // return head;
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
       while (fast != null && fast.next != null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }
}
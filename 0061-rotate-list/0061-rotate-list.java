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
    //   if(head==null||head.next==null){
    //     return head;
    //   }
    //    while(k>0){
    //     ListNode prev=null;
    //     ListNode curr=head;
    //     while(curr.next!=null){
    //         prev=curr;
    //         curr=curr.next;
    //     }
    //     curr.next=head;
    //     prev.next=null;
    //     head=curr;
    //     k--;

    //    }
    //    return head;
    if(head==null||head.next==null||k==0){
        return head;
    }
    ListNode tail;
    int n=1;
    tail=head;
    while(tail.next!=null){
        tail=tail.next;
        n++;
    }
    tail.next=head;
    k=k%n;
   
    ListNode new_tail=head;
    for(int i=0;i<n-k-1;i++){
        new_tail=new_tail.next;
    }
    ListNode new_head=new_tail.next;
    new_tail.next=null;
    return new_head;



       
    }
}
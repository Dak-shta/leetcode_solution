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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        return merge(left,right);


    }
    ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                ans.next=left;
                left=left.next;
            }
            else{
                ans.next=right;
                right=right.next;
            }
            ans=ans.next;
        }
        while(left!=null){
            ans.next=left;
            left=left.next;
            ans=ans.next;
        }
        while(right!=null){
            ans.next=right;
            right=right.next;
            ans=ans.next;
        }
        return dummy.next;
    }
}
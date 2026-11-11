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
    public ListNode removeNodes(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int maxi=Integer.MIN_VALUE;
        ListNode walk=prev;
        while(walk!=null){
            if(walk.val>=maxi){
                maxi=walk.val;
            }
            if(walk.val<maxi){
                walk=walk.next;
                continue;
            }
            else{
                ans.next=walk;
                ans=ans.next;
            }
            walk=walk.next;

        }
        ans.next=null;
        ListNode temp1=dummy.next;
        ListNode prev1=null;
        while(temp1!=null){
            ListNode curr1=temp1.next;
            temp1.next=prev1;
            prev1=temp1;
            temp1=curr1;
        }
        return prev1;


    }
}
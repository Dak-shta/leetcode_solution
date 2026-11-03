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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                ans.next=new ListNode(sum);
                ans=ans.next;
                sum=0;
            }
            sum=sum+temp.val;
            temp=temp.next;
    
        }
        return dummy.next;
    }
}
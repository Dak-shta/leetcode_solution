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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp=head;
        boolean inComponent=false;
        int c=0;
        while(temp!=null){
            boolean found=false;
           for(int i=0;i<nums.length;i++){
            if(temp.val==nums[i]){
                found=true;
                break;
            }
            
           }
           if(found&&inComponent==false){
            c++;
           
           }
           inComponent=found;
           temp=temp.next;
        }
        return c;
    }
}
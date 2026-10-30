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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp1=head;
        int c=0;
        while(temp1!=null){
            temp1=temp1.next;
            c++;
        }
        int[]ans=new int[c];
        List<Integer>list=new ArrayList<>();

        ListNode temp=head;
        ListNode pointer=head;
        while(temp!=null){
            int val=temp.val;
            pointer=temp;
            while(pointer!=null){
                if(val<pointer.val){
                    val=pointer.val;
                    
                    break;
                }
                
                pointer=pointer.next;
            }
            if(val==temp.val){
                list.add(0);
            }
            else{
                list.add(val);
                                                                                        }
        
            temp=temp.next;
        }
        for(int i=0;i<c;i++){
            ans[i]=list.get(i);
    }
        return ans;
    }
}
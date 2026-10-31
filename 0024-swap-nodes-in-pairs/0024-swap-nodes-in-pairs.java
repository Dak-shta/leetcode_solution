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
    public ListNode swapPairs(ListNode head) {
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode first=dummy;
    while(first.next!=null&&first.next.next!=null ){
        ListNode second=first.next;
        ListNode third=second.next;
        second.next=third.next;
        first.next=third;
        third.next=second;
        first=second;
    }
    return dummy.next;
    }
}
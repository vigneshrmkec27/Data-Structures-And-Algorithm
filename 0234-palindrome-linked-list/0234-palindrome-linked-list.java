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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        boolean ispal=true;
        ListNode first=head;
        ListNode second=reverse(slow);;
        while(second!=null)
        {
            if(first.val!=second.val) return false;
            first=first.next;
            second=second.next;
        }
        return true;
    }
    ListNode reverse(ListNode head)
    {
        ListNode temp=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode nextnode=curr.next;
            curr.next=temp;
            temp=curr;
            curr=nextnode;
        }
        return temp;
    }
}
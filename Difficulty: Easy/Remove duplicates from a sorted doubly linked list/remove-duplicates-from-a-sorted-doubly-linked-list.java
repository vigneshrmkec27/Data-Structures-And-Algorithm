// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        Node curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data==curr.next.data)
            {
                Node nextnode=curr.next.next;
                curr.next=nextnode;
                if(nextnode!=null)
                {
                    nextnode.prev=curr;
                }
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
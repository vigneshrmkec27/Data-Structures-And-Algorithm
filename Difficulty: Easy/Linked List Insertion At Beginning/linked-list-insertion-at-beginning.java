// User function Template for Java

class Solution {
    public Node insertAtBegining(Node head, int x) {
        // Code here
        if(head==null)
        {
            return null;
        }
        Node newnode=new Node(x);
        newnode.next=head;
        head=newnode;
        return head;
    }
}
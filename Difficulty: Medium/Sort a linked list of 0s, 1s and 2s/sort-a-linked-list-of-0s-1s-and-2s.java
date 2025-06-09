/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        if
        Node zerohead=new Node(-1),zerotail=zerohead;
        Node onehead=new Node(-1),onetail=onehead;
        Node twohead=new Node(-1),twotail=twohead;
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data==0)
            {
                zerotail.next=curr;
                zerotail=zerotail.next;
            }
            else if(curr.data==1)
            {
                onetail.next=curr;
                onetail=onetail.next;
            }
             else
            {
                twotail.next=curr;
                twotail=twotail.next;
            }
            curr=curr.next;
        }
        zerotail.next=(onehead.next!=null)?onehead.next:twohead.next;
        onetail.next=twohead.next;
        twotail.next=null;
        return zerohead.next;
        
        
    }
}
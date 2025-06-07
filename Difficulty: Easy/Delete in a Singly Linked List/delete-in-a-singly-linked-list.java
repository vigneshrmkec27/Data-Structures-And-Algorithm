/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head==null) return null;
        if(x==1) return head.next;
        Node temp=head;
        for(int i=1;i<x-1;i++)
        {
            if(temp==null || temp.next==null)
            {
                return head ;
            }
           temp=temp.next;
        }
        if(temp.next==null){ return head;}
        temp.next=temp.next.next;
         return head;
        
        
    }
}
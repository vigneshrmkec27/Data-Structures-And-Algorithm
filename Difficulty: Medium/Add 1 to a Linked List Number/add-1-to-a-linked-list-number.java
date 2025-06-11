/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here
        if (head == null) return new Node(1);
     
        head=reverse(head);
        int carry=1;
        Node curr=head;
        while(curr!=null)
        {
            int sum=curr.data+carry;
            curr.data=sum%10;
            carry=sum/10;
            if(carry==0)break;
            if(curr.next==null && carry>0)
            {
                curr.next=new Node(carry);
                carry=0;
            }
            curr=curr.next;
            
        }
        return reverse(head);
    }
    Node reverse(Node head){
        Node temp=null;
        Node curr=head;
       
        while(curr!=null)
        {
            Node nextnode=curr.next;
            curr.next=temp;
            temp=curr;
            curr=nextnode;
            
        }
        return temp;
    }
}
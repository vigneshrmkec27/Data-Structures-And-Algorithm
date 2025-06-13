/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Node first=head;
        Node last=tofindtail(head);
        while(first != null && last != null && first != last && first.prev != last)
        {
            if(first.data+last.data==target)
            {
               res.add(new ArrayList<>(Arrays.asList(first.data, last.data)));
                last=last.prev;
                first=first.next;
                
            }
            else if(first.data+last.data>target)
            {
                last=last.prev;
            }
            else{
                first=first.next;
            }
        }
        return res;
        
       
    }
    public static Node tofindtail(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        return temp;
    }
}

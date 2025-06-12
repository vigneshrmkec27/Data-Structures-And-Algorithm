// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node curr = head;
        
        while (curr != null) {
            if (curr.data == x) {
                // If it's the head node
                if (curr.prev == null) {
                    head = curr.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    // Middle or last node
                    curr.prev.next = curr.next;
                    if (curr.next != null) {
                        curr.next.prev = curr.prev;
                    }
                }
            }
            curr = curr.next;
        }
        
        return head;
    }
}

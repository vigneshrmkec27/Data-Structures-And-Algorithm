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
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
       Node newNode = new Node(x);

        if (head == null) {
            return newNode; // if list is empty
        }

        Node curr = head;
        int count = 0;

        // Traverse to the p-th node
        while (count < p && curr != null) {
            curr = curr.next;
            count++;
        }

        if (curr == null) {
            // p is invalid (should not happen as per constraints)
            return head;
        }

        // Insert newNode after curr
        newNode.next = curr.next;
        newNode.prev = curr;
        if (curr.next != null) {
            curr.next.prev = newNode;
        }
        curr.next = newNode;

        return head;
    
    }
}
/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
   static void helper(Node root,ArrayList<Integer>li)
    {
        if(root==null)return;
        helper(root.left,li);
       
        helper(root.right,li);
         li.add(root.data);
    }
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
           ArrayList<Integer>li=new ArrayList<>();
        helper(root,li);
        return li;
    }
}
/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    
    // Function to return a list containing the inorder traversal of the tree.
    static void helper(Node root,ArrayList<Integer>li)
    {
        if(root==null)return;
        helper(root.left,li);
        li.add(root.data);
        helper(root.right,li);
    }
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer>li=new ArrayList<>();
        helper(root,li);
        return li;
    }
}
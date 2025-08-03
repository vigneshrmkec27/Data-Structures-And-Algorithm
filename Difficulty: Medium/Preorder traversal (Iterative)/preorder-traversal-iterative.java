// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree {
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root) {
        // Code
        ArrayList<Integer>li=new ArrayList<>();
        if (root == null) return li;
        Stack<Node>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node top=st.pop();
            li.add(top.data);
            if(top.right!=null)st.push(top.right);
            if(top.left!=null)st.push(top.left);
        }
        return li;
    }
}
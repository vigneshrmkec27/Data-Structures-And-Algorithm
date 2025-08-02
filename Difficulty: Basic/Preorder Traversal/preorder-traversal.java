class Solution {
   static void helper(Node root,ArrayList<Integer>li)
   {
        if(root==null){return;}
        li.add(root.data);
        helper(root.left,li);
        helper(root.right,li);
   }
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer>li=new ArrayList<>();
       helper(root,li);
        return li;
    }
}
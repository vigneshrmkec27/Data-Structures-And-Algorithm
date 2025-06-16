// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int[] temp=new int[arr.length];
        temp[0]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            temp[i]=arr[i-1];
        }
         for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        
    }
}
// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        return generate(N,arr,K,0,0);
        
    }
    public static boolean generate(int n,int[] arr,int k,int index,int sum)
    {
       if (sum==k )return true;
       if (index==n || sum>k) return false;
        if(generate(n,arr,k,index+1,sum+arr[index]))return true;
        if(generate(n,arr,k,index+1,sum))return true;
      
       return false;
    }
}

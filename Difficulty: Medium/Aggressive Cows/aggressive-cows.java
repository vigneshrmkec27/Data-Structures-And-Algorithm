// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
       
       Arrays.sort(stalls);
        int low=1;
        int ans=0;
        int high=stalls[stalls.length-1];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(fn(stalls,mid,k)){
               ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
        
    }
    public static boolean fn(int[] stalls,int mid,int k)
    {
        int cowscount=1;
       // Arrays.sort(stalls);
        int lastcow=stalls[0];
        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-lastcow>=mid){
                cowscount++;
                lastcow=stalls[i];
            }
        }
        if(cowscount>=k)return true;
        
        return false;
    }
}
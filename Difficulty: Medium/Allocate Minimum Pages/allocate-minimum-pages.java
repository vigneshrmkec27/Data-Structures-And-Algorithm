
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)return -1;
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
         int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int low=maxi;
        int ans=0;
        int high=sum;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(fn(arr,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean fn(int[] arr,int k,int mid)
    {
        int students=1;
        int pagescount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+pagescount<=mid)
            {
                pagescount+=arr[i];
            }
            else{
                students++;
                pagescount=arr[i];
            }
        }
        if(students<=k)return true;
        return false;
    }
}
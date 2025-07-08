// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        
       int index=-1;
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           int firstOneIdx = firstindex(arr[i], 1);
            if (firstOneIdx != -1) {
                int max_ones = arr[0].length - firstOneIdx;
                if (max_ones > count) {
                    count = max_ones;
                    index = i;
                }
            }
       }
       return index;
        
    }
    public int firstindex(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
                
            }
        }
        return ans;
    }
}
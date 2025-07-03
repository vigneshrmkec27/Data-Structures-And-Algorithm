class Solution {
    int countFreq(int[] arr, int target) {
        // code here
         int f=firstindex(arr,target);
         if(f==-1)return 0;
        int l=lastindex(arr,target);
        return l-f+1;
        
    }
     public int firstindex(int[] arr,int target)
    {
        int low=0;
        int high=arr.length-1;
        int index=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                index=mid;
                high=mid-1;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return index;
    }
     public int lastindex(int[] arr,int target)
    {
        int low=0;
        int high=arr.length-1;
        int index=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                index=mid;
                low=mid+1;
                
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return index;
    }
}

class Solution {
    public int firstindex(int[] nums,int target)
    {
        int low=0;
        int high=nums.length-1;
        int index=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                index=mid;
                high=mid-1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return index;
    }
     public int lastindex(int[] nums,int target)
    {
        int low=0;
        int high=nums.length-1;
        int index=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                index=mid;
                low=mid+1;
                
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int f=firstindex(nums,target);
        if(f==-1)
        {
            return new int[]{-1,-1};
        }
        int l=lastindex(nums,target);
        return new int[]{f,l};
    }
}
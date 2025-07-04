class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
             if (nums[low] <= nums[high]) {
                mini = Math.min(mini, nums[low]);
                break;
            }
            if(nums[low]<=nums[mid])
            {
                if(mini>nums[mid]){
                mini=nums[mid];
                }
                low=mid+1;
            }
            else{
                 
                if(mini>nums[mid])
                {
                    mini=nums[mid];
                }
                high=mid-1;
               

            }
        }
        return mini;
        
    }
}
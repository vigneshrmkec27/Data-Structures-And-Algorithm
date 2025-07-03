class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int index=nums.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                index=mid;
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
        return index;
    }
}
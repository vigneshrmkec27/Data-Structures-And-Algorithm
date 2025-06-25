class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
     public int atmost(int[] nums, int k)
    {
        if (k < 0) return 0;
        int left=0;
        int sum=0;
        int maxi=0;
        for(int right=0;right<nums.length;right++)
        {
             sum+=nums[right]%2;
            while(sum>k)
            {
                sum-=nums[left]%2;
                left++;
            }
            maxi+=(right-left+1);
        }
        return maxi;
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros=0;
        int maxi=0;
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)zeros++;
            while(zeros>k)
            {
                if(nums[left]==0)zeros--;
                left++;
            }
            maxi=Math.max(maxi,right-left+1);
        }return maxi;

        
    }
}
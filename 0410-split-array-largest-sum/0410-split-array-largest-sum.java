class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int maxi=0;
      for (int num : nums) sum += num;
      for (int num : nums) maxi = Math.max(maxi, num);

        int low=maxi;
        int ans=0;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(countsubarray(nums,mid)<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
        return ans;

        
    }
    public int countsubarray(int[] nums,int mid)
    {
        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else{
                count+=1;
                sum=nums[i];
            }
        }
        return count;
    }
}
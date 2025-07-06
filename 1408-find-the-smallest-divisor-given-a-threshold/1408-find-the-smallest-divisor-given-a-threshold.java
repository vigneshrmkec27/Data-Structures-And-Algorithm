class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi=0;
        for(int i=0;i<nums.length;i++)
        {
            maxi=Math.max(maxi,nums[i]);
        }
       int low=1;
       int ans=maxi;
       int high=maxi;
       while(low<=high)
       {
        int mid=low+(high-low)/2;
        if(count(nums,mid)<=threshold){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
    public int count(int[] nums,int div)
    {
       int count=0;
        for(int i=0;i<nums.length;i++)
        {
          count+=Math.ceil((double)nums[i]/div);
        }
        return count;
    }
}
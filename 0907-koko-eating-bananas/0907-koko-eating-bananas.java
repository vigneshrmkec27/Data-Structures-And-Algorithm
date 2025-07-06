class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = Integer.MIN_VALUE;
        for (int pile:piles ) {
            maxi = Math.max(maxi, pile);
        }
        int low=1;
        int high=maxi;
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ifPossible(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public boolean ifPossible(int[] piles,int h,int mid)
    {
        long count=0;
        for(int pile:piles)
        {
            count+=(pile+mid-1)/mid;
        }
        return count<=h;
    }
}
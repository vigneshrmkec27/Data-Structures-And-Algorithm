class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            mini=Math.min(mini,bloomDay[i]);
            maxi=Math.max(maxi,bloomDay[i]);
        }
        long totalFlowersNeeded = (long) m * k;
        if (totalFlowersNeeded > bloomDay.length) return -1;
        int low=mini;
        int high=maxi;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(can_make(bloomDay,m,k,mid)){
                    ans=mid;
                    high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
        return ans;
        
    }
    public boolean can_make(int[] bloomDay,int m,int k,int mid){
        int cnt=0;
        int bouque=0;
        for(int bloom:bloomDay)
        {
            if (bloom <= mid) {
                cnt++;
                if (cnt == k) {
                    bouque++;
                    cnt = 0;
                }
            }
            else{
                
                cnt=0;
            }
           
        }
        if(bouque>=m)return true;
        return false;
    }
}
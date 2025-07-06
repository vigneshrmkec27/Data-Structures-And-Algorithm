class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        for (int num : weights) {
            max = Math.max(max, num);
        }
       int sum=0;
       for (int num : weights) {
            sum+=num;
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(days(weights,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int days(int[] weights,int capacity)
    {
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>capacity)
            {
                day=day+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
}
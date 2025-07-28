class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int maxi=0;
       for(int num:set)
       {
        
        if(!set.contains(num-1))
        {
            int streak=1;
            int currnum=num;
            while(set.contains(currnum+1))
            {
                streak++;
                currnum++;
            }
            maxi=Math.max(maxi,streak);
        }
       }
       return maxi;
        
    }

}
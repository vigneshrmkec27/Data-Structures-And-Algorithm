class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
               sum=sum+nums[i];
              if(map.containsKey(sum-goal))count+=map.get(sum-goal);
              map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}
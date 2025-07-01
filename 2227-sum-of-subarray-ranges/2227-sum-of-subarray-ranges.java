class Solution {
    public long subArrayRanges(int[] nums) {
        return subarraymax(nums)-subarraymin(nums);
    }
    public long subarraymin(int[] nums)
    {
//to find pse and nse
Stack<Integer>st=new Stack<>();
      int[] pse=new int[nums.length];
      int[] nse=new int[nums.length];
      for(int i=0;i<nums.length;i++)
      {
        while(!st.isEmpty() && nums[st.peek()]>nums[i])st.pop();
        pse[i]=st.isEmpty()?-1:st.peek();
        st.push(i);
      }
      st.clear();
      for(int i=nums.length-1;i>=0;i--)
      {
        while(!st.isEmpty() && nums[st.peek()]>=nums[i])st.pop();
        nse[i]=st.isEmpty()?nums.length:st.peek();
        st.push(i);
      }
     long cnt=0;
      for(int i=0;i<nums.length;i++)
      {
        int left=i-pse[i];
        int right=nse[i]-i;
        cnt+=1L*nums[i]*left*right;
      }
      return cnt;
    }
    public long subarraymax(int[] nums)
    {
//to find pge and nge
int[] pge=new int[nums.length];
int[] nge=new int[nums.length];
Stack<Integer>st=new Stack<>();
      
      for(int i=0;i<nums.length;i++)
      {
        while(!st.isEmpty() && nums[st.peek()]<nums[i])st.pop();
        pge[i]=st.isEmpty()?-1:st.peek();
        st.push(i);
      }
      st.clear();
      for(int i=nums.length-1;i>=0;i--)
      {
        while(!st.isEmpty() && nums[st.peek()]<=nums[i])st.pop();
        nge[i]=st.isEmpty()?nums.length:st.peek();
        st.push(i);
      }
      long cnt=0;
      for(int i=0;i<nums.length;i++)
      {
        int left=i-pge[i];
        int right=nge[i]-i;
        cnt+=1L*nums[i]*left*right;
      }
      return cnt;
    }
}
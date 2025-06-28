class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        powerset(nums,0,new ArrayList<>(),res);
        return res;
    }
    private void powerset(int[] nums,int index,List<Integer>current, List<List<Integer>>res)
    {
        if(index==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        powerset(nums,index+1,current,res);
        current.remove(current.size()-1);
         powerset(nums,index+1,current,res);
    }
}
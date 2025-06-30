// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    
    // in array arr that sum to target.
     private
     static void combi_sum_1(int[] arr,int target,int index, 
     ArrayList<Integer> curr,int sum, ArrayList<ArrayList<Integer>>res)
     {
         if(index==arr.length)
         {
             if(sum==target) res.add(new ArrayList<>(curr));
             return;
         }
         if(sum<=target)
         {
             curr.add(arr[index]);
             combi_sum_1(arr,target,index,curr,sum+arr[index],res);
             curr.remove(curr.size()-1);
         }
         combi_sum_1(arr,target,index+1,curr,sum,res);
     }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        // add your code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        combi_sum_1(arr,target,0,new ArrayList<>(),0,res);
        return res;
    }
}
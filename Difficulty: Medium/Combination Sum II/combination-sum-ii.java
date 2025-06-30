// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    private
     static void combi_sum_1(int[] arr,int target,int index, 
     ArrayList<Integer> curr, ArrayList<ArrayList<Integer>>res)
     {
     
             if(target==0){ res.add(new ArrayList<>(curr));
             return;
             }
        
        for (int i = index; i < arr.length; i++) {
            // Skip duplicates
            if (i > index && arr[i] == arr[i - 1]) continue;
             if (arr[i] > target) break;
             curr.add(arr[i]);
             combi_sum_1(arr,target-arr[i],i+1,curr,res);
             curr.remove(curr.size()-1);
         }
        
     }
    static ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // add your code here
        Arrays.sort(arr);
          ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        combi_sum_1(arr,target,0,new ArrayList<>(),res);
        return res;
    }
}
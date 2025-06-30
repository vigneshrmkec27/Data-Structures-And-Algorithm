class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
       return subset(arr,sum,0,0);
    }
    private static Boolean subset(int arr[],int sum,int index,int target)
    {
        if(sum==target)return true;
        if (index >= arr.length || target > sum)    // ✅ Reached end or overshot
            return false;
        if(subset(arr,sum,index+1,target+arr[index]))return true;
         if(subset(arr,sum,index+1,target))return true;
        return false;
    }
}
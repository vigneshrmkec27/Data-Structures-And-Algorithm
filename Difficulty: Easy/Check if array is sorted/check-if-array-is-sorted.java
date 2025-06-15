class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
      
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
              
                return false;
            }
        }
        return true;
    }
}
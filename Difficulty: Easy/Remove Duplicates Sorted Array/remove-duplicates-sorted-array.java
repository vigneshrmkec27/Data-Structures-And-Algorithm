class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
               
                i++;
                 arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
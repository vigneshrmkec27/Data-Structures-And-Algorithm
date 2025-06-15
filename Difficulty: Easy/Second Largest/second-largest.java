class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large=arr[0];
        int slarge=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                slarge=large;
                large=arr[i];
            }
            else if(arr[i]>slarge && arr[i]!=large)
            {
                slarge=arr[i];
            }
        }
        return slarge;
    }
}
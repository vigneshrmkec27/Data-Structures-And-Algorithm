class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++)
        {
            int mini=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[mini])mini=j;
                
                
            }
             int temp=arr[i];
                arr[i]=arr[mini];
                arr[mini]=temp;
        }
    }
}
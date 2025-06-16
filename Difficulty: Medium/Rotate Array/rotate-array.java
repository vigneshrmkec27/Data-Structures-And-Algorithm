// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d=d%n;
         reverse( arr,0,d-1);
    reverse( arr,d,n-1);
    reverse( arr,0,n-1);
    }
public static void reverse(int arr[],int strat,int end)
{
    while(strat<end)
    {
    int temp=arr[strat];
    arr[strat]=arr[end];
    arr[end]=temp;
    strat++;
    end--;
    }
}
}
class Solution {
    static int majorityElement(int arr[]) {
        // code here
         int cnt=0;
        int ele=-1;
        for(int i=0;i<arr.length;i++)
        {
       
        if(cnt==0)
        {
            cnt=1;
            ele=arr[i];
        }
        else if(ele==arr[i]) cnt++;
        else cnt--;
        
        }
        int cnt1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(ele==arr[i]) cnt1++;
            if(cnt1 > (arr.length)/2) return ele;
        }
        return -1;
    }
}
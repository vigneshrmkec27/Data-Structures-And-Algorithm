class Solution {
    public void swapIfGreater(int[] nums1,  int[] nums2, int i,int j)
    {
        if(nums1[i]>nums2[j])
        {
            int temp=nums1[i];
            nums1[i]=nums2[j];
            nums2[j]=temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=n+m;
      int gap = (len / 2) + (len % 2);

        while(gap>0){
        int left=0;
        int right=gap;
        while(right<len)
        {
            if(left<m && right>=m)  swapIfGreater(nums1, nums2, left, right - m);
            else if(left>=m)  swapIfGreater(nums2, nums2, left-m, right - m);
            else  swapIfGreater(nums1, nums1, left, right );
        left++;
        right++;
        }
        if (gap == 1) break;
         gap = (gap / 2) + (gap % 2);
        
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];}
        
        
    }
}
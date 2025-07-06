class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int m=n1+n2;
        int i=0;
        int j=0;
        List<Integer>temp=new ArrayList<>();
        while(i<n1 && j< n2)
        {
            if(nums1[i]<nums2[j]){
                temp.add(nums1[i++]);
            }
            else{
                temp.add(nums2[j++]);
            }
        }
        while(i<n1)temp.add(nums1[i++]);
        while(j<n2)temp.add(nums2[j++]);
        if(m%2==1)
        {
            return temp.get(m/2);
        }
        else{
             return (temp.get(m/2)+temp.get(m/2-1))/2.0;
        }
        
    }
}
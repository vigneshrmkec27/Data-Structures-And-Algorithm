class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int maxrow=max(mat,mid);
            int left=mid>0?mat[maxrow][mid-1]:-1;
             int right=mid<mat[0].length-1?mat[maxrow][mid+1]:-1;
             if(mat[maxrow][mid]>left && mat[maxrow][mid]>right){
            return new int[]{maxrow,mid};
        }
             if(left>mat[maxrow][mid])high=mid-1;
             else low=mid+1;

        }
        return new int[]{-1,-1};

        
    }
    public int max(int[][] mat,int mid){
        int maxi=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][mid]>maxi){
                maxi=mat[i][mid];
                index=i;
            }
        }
        return index;
        
    }
}
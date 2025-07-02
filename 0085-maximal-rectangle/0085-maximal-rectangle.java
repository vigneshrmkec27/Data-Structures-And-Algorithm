class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] row=new int[matrix[0].length];
        int maxArea=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
               if(matrix[i][j]=='1')row[j]++;
               else row[j]=0;
            }
            maxArea = Math.max(maxArea, histogram(row));
        }
        return maxArea ;
    }
    public int histogram(int[] row)
    {
        int maxi=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<=row.length;i++)
        {
            int height=(i==row.length)?0:row[i];
            while(!st.isEmpty()&& row[st.peek()]>height){
            
            int ele=st.pop();
            int pse=st.isEmpty()?-1:st.peek();
            int nse=i;
            maxi=Math.max(maxi,row[ele]*(nse-pse-1));
            }
            st.push(i);
        }
        return maxi;
    }
}
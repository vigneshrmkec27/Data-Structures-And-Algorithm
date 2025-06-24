class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int rightsum=0;
        int maxi=0;
        for(int i=0;i<k;i++)
        {
            leftsum+=cardPoints[i];
        }
        maxi=leftsum;
        int rind=cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {
            leftsum=leftsum-cardPoints[i];
            rightsum=rightsum+cardPoints[rind];
            rind--;
            maxi=Math.max(maxi,leftsum+rightsum);
        }
        return maxi;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>merged=new ArrayList<>();
        int[] current=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            int[] next=intervals[i];
            if(current[1]>=next[0])
            {
                //overlap occurs
                current[1]=Math.max(current[1],next[1]);

            }
            else{
                //no overlap occurs
                merged.add(current);
                current=next;

            }
        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
        
    }
}
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int xor=0;
        int x=0;
        long cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            xor=xor^arr[i];
            x=xor^k;
            
                cnt+=map.getOrDefault(x,0);
                
            
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return cnt;
    }
}
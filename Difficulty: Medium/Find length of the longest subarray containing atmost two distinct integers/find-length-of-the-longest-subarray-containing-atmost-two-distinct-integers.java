// User function Template for Java

class Solution {
    public static int totalElements(Integer[] arr) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;
        int maxi=0;
        for(int right=0;right<arr.length;right++)
        {
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>2)
            {
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0)map.remove(arr[left]);
                left++;
            }
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;
    }
}
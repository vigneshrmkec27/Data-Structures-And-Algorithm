// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int maxi=-1;
        for(int right=0;right<s.length();right++)
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k)
            {
               map.put(s.charAt(left),map.get(s.charAt(left))-1);
               if(map.get(s.charAt(left))==0)map.remove(s.charAt(left));
               left++;
            }
            if(map.size()==k)maxi=Math.max(maxi,right-left+1);
            
        }
        return maxi;
        
    }
}
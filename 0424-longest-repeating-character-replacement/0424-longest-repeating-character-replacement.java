class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;int count=0;
        int maxlen=0;
        for(int right=0;right<s.length();right++)
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
        count=Math.max(count,map.get(s.charAt(right)));
        while((right-left+1)-count>k)
        {
            map.put(s.charAt(left),map.get(s.charAt(left))-1);
            left++;
            if(map.get(s.charAt(left))==0)map.remove(s.charAt(left));
        }
        maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:t.toCharArray())map.put(ch,map.getOrDefault(ch,0)+1);
        int left=0,cnt=0,index=-1,minlen=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++)
        {
            
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)-1);
            if(map.get(s.charAt(right))>=0)cnt+=1;
            while(cnt==t.length())
            {
                if(right-left+1<minlen)
                {minlen=right-left+1;
                index=left;
                }
               map.put(s.charAt(left) ,map.get(s.charAt(left))+1);
                if(map.get(s.charAt(left))>0)cnt--;
                left+=1;
            }
        }
        return index==-1?"":s.substring(index,index+minlen);

        
    }
}
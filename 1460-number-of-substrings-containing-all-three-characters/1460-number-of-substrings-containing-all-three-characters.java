class Solution {
    public int numberOfSubstrings(String s) {
        int lastseenA=-1;
        int lastseenB=-1;
        int lastseenC=-1;
        int count=0;
        for(int right=0;right<s.length();right++)
        {
            if(s.charAt(right)=='a')lastseenA=right;
            else if(s.charAt(right)=='b')lastseenB=right;
            else lastseenC=right;
            count += 1 + Math.min(lastseenA, Math.min(lastseenB, lastseenC));

        }
        return count;

        
    }
}
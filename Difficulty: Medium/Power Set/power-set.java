// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String>res=new ArrayList<>();
        generate(s,0,"",res);
        Collections.sort(res);
        return res;
    }
    private void generate(String s,int index,String current,List<String>res)
    {
        if(index==s.length())
        {
            if(!current.isEmpty())
            res.add(current);
            return;
        }
        generate(s,index+1,current+s.charAt(index),res);
        generate(s,index+1,current,res);
    }
}
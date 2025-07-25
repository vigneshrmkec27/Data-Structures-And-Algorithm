// User function Template for Java

class Solution {
    public static int xortill(int n)
    {
        if(n%4==1)return 1;
        else if(n%4 == 2)return n+1;
        else if(n%4==3)return 0;
        else return n;
    }
    public static int findXOR(int l, int r) {
        return xortill(r)^xortill(l-1);
    }
}
// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
       for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        arr.clear();
       int i = 0, j = 0;

        // Add alternately from pos and neg
        while (i < pos.size() && j < neg.size()) {
            arr.add(pos.get(i++));
            arr.add(neg.get(j++));
        }

        // Add remaining from pos[]
        while (i < pos.size()) arr.add(pos.get(i++));

        // Add remaining from neg[]
        while (j < neg.size()) arr.add(neg.get(j++));
    }
}
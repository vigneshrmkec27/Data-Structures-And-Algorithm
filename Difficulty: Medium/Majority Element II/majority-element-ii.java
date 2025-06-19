//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int cnt1=0;
            int cnt2=0;
            int ele1=0;
            int ele2=0;
        for(int i=0;i<nums.length;i++)
        {
            
            if(cnt1==0 && nums[i]!=ele2)
            {
               
                ele1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0 && nums[i]!=ele1)
            {
                ele2=nums[i];
                cnt2=1;
                
            }
            else if(ele1==nums[i])
            {
                cnt1++;
            }
            else if(ele2==nums[i])
            {
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int c1=0;
        int c2=0;
        for(int num:nums)
        {
            if(num==ele1)
            {
                c1++;
            }
            else if(num==ele2)
            {
                c2++;
            }
            
        }
       List<Integer>ans=new ArrayList<>();
       if(c1>nums.length/3)
       {
           ans.add(ele1);
       }
        if(c2>nums.length/3)
       {
           ans.add(ele2);
       }
       Collections.sort(ans);
       return ans;
    }
}

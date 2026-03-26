package Sliding_Window;

import java.util.HashMap;

public class Q7 {
    public static void main(String[] args) {
        //Longest Substring with K Uniques:

        String s="aabacbebebe";
        int k=3;

        HashMap<Character,Integer> hm=new HashMap<>();
        int left=0,right=0,max=-1;
        while(right<s.length()){
            hm.put(s.charAt(right),hm.getOrDefault(s.charAt(right),0)+1);
            while(hm.size()>k){
                char l=s.charAt(left);
                hm.put(l,hm.get(l)-1);
                if(hm.get(l)==0)hm.remove(l);
                left++;
            }
            if(hm.size()==k)max=Math.max(max,right-left+1);
            right++;
        }
        System.out.println(max);
    }
}

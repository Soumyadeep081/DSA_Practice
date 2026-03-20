package Sliding_Window;

import java.util.HashMap;

public class Q6 {
    public static void main(String[] args) {
        //Fruits into baskets:

        int[]fruits={0,1,2,2};

        HashMap<Integer,Integer>hm=new HashMap<>();
        int left=0,right=0,max=0;
        while(right<fruits.length){
            hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);
            while(hm.size()>2){
                hm.put(fruits[left],hm.get(fruits[left])-1);
                if(hm.get(fruits[left])==0)hm.remove(fruits[left]);
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }

        System.out.println(max);
    }
}

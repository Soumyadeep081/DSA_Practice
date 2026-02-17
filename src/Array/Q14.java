package Array;

import java.util.HashMap;

public class Q14 {
    public static void main(String[] args) {
        //974. Subarray Sums Divisible by K:

        int[]nums={4,5,0,-2,-3,1};
        int k=5;

        int count=0,sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int num:nums){
            sum+=num;
            int target=sum%k;
            if(target<0)target+=k;
            if(hm.containsKey(target))count+=hm.get(target);
            hm.put(target,hm.getOrDefault(target,0)+1);
        }
        System.out.println(count);
    }
}

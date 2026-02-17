package Sliding_Window;

import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        //Subarray with XOR k:
        int[]nums={4,2,2,6,4};
        int k=6;
        //Same as subarray sum equals k:

        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;
        int sum=0;
        for(int num:nums){
            sum^=num;
            int target=sum^k;
            if(hm.containsKey(target))count+=hm.get(target);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}

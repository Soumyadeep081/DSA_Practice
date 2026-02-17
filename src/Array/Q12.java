package Array;

import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        //Subarrays with equal 1s and 0s:
        int[]arr={1,0,0,1,0,1,1};

        HashMap<Integer,Integer> hm=new HashMap<>();
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i]==0?-1:arr[i];
            hm.put(curr,hm.getOrDefault(curr,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()>1)count+=((entry.getValue()*(entry.getValue()-1))/2);
        }
        if(hm.containsKey(0)){
            count+=hm.get(0);
        }
        System.out.println(count);
    }
}

package Array;

import java.util.HashMap;

public class Q13 {
    public static void main(String[] args) {
        //525. Contiguous Array:
        int[]nums={1,1,0,0,1,1,0,1,1};


        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)nums[i]=-1;
        }
        int max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum)){
                max=Math.max(max,i-hm.get(sum));
            }
            else hm.put(sum,i);
        }
    }
}

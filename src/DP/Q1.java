package DP;

public class Q1 {
    public static void main(String[] args) {
        //152. Maximum Product Subarray:

        int[]nums={2,3,-2,4};

        int max=nums[0],min=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=max;
            max=Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            min=Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]);

            if(max>ans)ans=max;
        }
        System.out.println(ans);
    }
}

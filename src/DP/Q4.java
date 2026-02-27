package DP;

public class Q4 {
    public static void main(String[] args) {
        //1186. Maximum Subarray Sum with One Deletion:

        int[]nums={1,-2,0,3};

        int zero=nums[0];
        int one=nums[0];
        int res=nums[0];

        for(int i=1;i<nums.length;i++){
            int prev=zero;

            zero=Math.max(zero+nums[i],nums[i]);
            one=Math.max(one+nums[i],prev);

            res=Math.max(res,Math.max(one,zero));
        }
        System.out.println(res);
    }
}

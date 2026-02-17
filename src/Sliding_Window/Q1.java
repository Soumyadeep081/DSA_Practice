package Sliding_Window;

public class Q1 {
    public static void main(String[] args) {
        //1493. Longest Subarray of 1's After Deleting One Element:

        int[]nums={0,1,1,1,0,1,1,0,1};
        System.out.println(f(nums));
    }
    private static int f(int[]nums){
        int left=0,res=0,zeroes=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)zeroes++;
            while(zeroes>1){
                if(nums[left]==0)zeroes--;
                left++;
            }
            res=Math.max(res,right-left);
        }
        return res;
    }
}

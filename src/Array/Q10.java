package Array;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        //53. Maximum Subarray:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums) {
        int curr=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}

package Array;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        //724. Find Pivot Index:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println(pivotIndex(a));
    }
    public static int pivotIndex(int[] nums) {
        int total=0, left=0;
        for (int num:nums) {
            total+=num;
        }
        for(int i=0;i<nums.length;i++){
            if(left==total-left-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}

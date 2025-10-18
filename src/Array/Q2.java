package Array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //2091. Removing Minimum and Maximum From Array:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println(minimumDeletions(a));

    }
    public static int minimumDeletions(int[] nums) {
        int minIndex=0;
        int maxIndex=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxIndex]){
                maxIndex=i;
            }
            if(nums[i]<nums[minIndex]){
                minIndex=i;
            }
        }

        int deleteFromFront=Math.max(maxIndex, minIndex)+1;
        int deleteFromBack=n-Math.min(maxIndex, minIndex);
        int deleteFromBothSide=(Math.min(maxIndex, minIndex)+1)+(n-Math.max(maxIndex, minIndex));

        return Math.min(deleteFromBothSide, Math.min(deleteFromFront, deleteFromBack));
    }
}

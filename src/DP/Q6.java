package DP;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        //Subset Sum Problem: Determine if there is a subset of arr[] with sum equal to given sum.

        int[]arr={3, 34, 4, 12, 5, 2};
        int sum=9;

        System.out.println(isSubsetSum(arr,sum));
    }
    static int [][]dp;
    static Boolean isSubsetSum(int arr[], int sum) {
        dp=new int[arr.length][sum+1];
        for(int[]row:dp) Arrays.fill(row,-1);
        return f(arr,sum,0,0);
    }
    static boolean f(int[]arr,int sum,int i,int s){
        if (s == sum)
            return true;
        if(i==arr.length||s>sum){
            return false;
        }
        if(dp[i][s]!=-1)return dp[i][s]==1;
        boolean pick=f(arr,sum,i+1,s+arr[i]);
        boolean np=f(arr,sum,i+1,s);
        dp[i][s]=(pick||np)?1:0;
        return dp[i][s]==1;
    }
}

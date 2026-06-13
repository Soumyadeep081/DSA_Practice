package DP;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        //Partition Equal Subset Sum:
        int[]arr={1,5,11,5};
        System.out.println(equalPartition(arr));
    }
    static int[][]dp;
    static boolean equalPartition(int arr[]) {
        int sum=0;
        for(int num:arr)sum+=num;
        if(sum%2!=0)return false;
        dp=new int[arr.length][(sum/2)+1];
        for(int[]row:dp) Arrays.fill(row,-1);
        return f(arr,0,0,sum/2);
    }
    private static boolean f(int[]arr,int i,int sum,int ts){
        if(sum==ts)return true;
        if(i>=arr.length||sum>ts)return false;
        if(dp[i][sum]!=-1)return dp[i][sum]==1;
        boolean p=f(arr,i+1,sum+arr[i],ts);
        boolean np=f(arr,i+1,sum,ts);
        dp[i][sum]=(p||np)?1:0;
        return dp[i][sum]==1;
    }
}

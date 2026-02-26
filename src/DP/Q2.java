package DP;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        //Coin Change 1:
        int[]coins={1,2,5};
        int sum=11;

        System.out.println(f(coins,sum));
    }
    private static int f(int[]coins,int sum){
        int inf=(int)1e9;
        int[]dp=new int[sum+1];
        Arrays.fill(dp,inf);
        dp[0]=0;
        for(int coin:coins){
            for(int i=coin;i<=sum;i++){
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[sum]==inf?-1:dp[sum];
    }
}

package DP;

public class Q3 {
    public static void main(String[] args) {
        //Coin Change 2:

        int[]coins={1,2,5};
        int sum=5;

        System.out.println(f(coins,sum));
    }
    public static int f(int[]coins,int sum){
        int[]dp=new int[sum+1];
        dp[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=sum;i++){
                dp[i]+=dp[i-coin];
            }
        }
        return dp[sum];
    }
}

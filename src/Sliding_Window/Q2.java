package Sliding_Window;

public class Q2 {
    public static void main(String[] args) {
        //930. Binary Subarrays With Sum:
        int[]nums={1,0,1,0,1};
        int k=2;

        int[]count=new int[nums.length+1];
        int res=0;
        count[0]=1;
        int sum=0;
        for(int num:nums){
            sum+=num;
            if(sum>=k)res+=count[sum-k];
            count[sum]++;
        }
        System.out.println(res);
    }
}

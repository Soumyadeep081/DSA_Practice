package Sliding_Window;

public class Q3 {
    public static void main(String[] args) {
        //1248. Count Number of Nice Subarrays:
        //Same as Q3 just consider every odd number as 1 and every even number as 0:
        int[]nums={1,1,2,1,1};
        int k=3;

        int[]count=new int[nums.length+1];
        int sum=0,res=0;
        count[0]=1;
        for(int num:nums){
            if(num%2!=0)sum+=1;
            if(sum>=k)res+=count[sum-k];
            count[sum]++;
        }
        System.out.println(res);
    }
}

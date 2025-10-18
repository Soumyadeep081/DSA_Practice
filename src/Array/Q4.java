package Array;

import java.util.HashMap;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //3005. Count Elements With Maximum Frequency:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println(f(a));
    }
    private static int f(int[]nums){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int i:hm.values()){
            max=Math.max(max,i);
        }

        int c=0;
        for(int i:hm.values()){
            if(i==max)c+=max;
        }
        return c;
    }
}

package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        //169. Majority Element:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println(majorityElement(a));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int maxKey=0;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                maxKey=entry.getKey();
            }
        }
        return maxKey;
    }
}

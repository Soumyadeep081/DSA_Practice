package Recursion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //find Pivot index:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println(f(a));

        int total=0;
        for(int num:a)total+=num;
        System.out.println(f2(a,0,total,0));
    }
    //Approach 1:Iteration
    private static int f(int[]a){
        int total=0,left=0;
        for(int num:a){
            total+=num;
        }
        for(int i=0;i<a.length;i++){
            if(left==total-left-a[i])return i;
            left+=a[i];
        }
        return -1;
    }
    //Approach 2:Recursion:
    private static int f2(int[]a,int left,int total,int i){
        if(i==a.length)return -1;
        if(left==total-left-a[i])return i;
        return f2(a,left+a[i],total,i+1);
    }
}

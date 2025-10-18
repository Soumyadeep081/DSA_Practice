package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Problem statement
        //Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(input.nextInt());
        }
        int m=input.nextInt();

        System.out.println("Actual Array: ");
        System.out.println(arr);

        System.out.println("Reversed array after mth index: ");
        f(arr,m);



    }
    private static void f(ArrayList<Integer>arr,int m){
        int start=m+1;
        int end=arr.size()-1;
        while (start<end){
            int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
        System.out.println(arr);

    }
}

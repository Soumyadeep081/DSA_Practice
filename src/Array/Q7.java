package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        //Find all repeating elements in an array:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        f(a);
        System.out.println();
        f2(a);

    }
    //Approach 1: In-place
    private static void f(int[]a){
        Arrays.sort(a);
        System.out.println("Repeating elements are: ");
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                System.out.print(a[i]+" ");
            }
        }
    }

    //Approach 2: using HashMap:
    private static void f2(int[]a){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:a){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        System.out.println("Repeating elements are: ");
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()>1) System.out.print(entry.getKey()+" ");
        }
    }
}

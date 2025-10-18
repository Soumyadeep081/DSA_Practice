package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //189. Rotate Array:

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int k=input.nextInt();
        f(a,k);
        System.out.println(Arrays.toString(a));
    }
    private static void f(int[]a,int k){
        int n=a.length;
        k=k%n;
        int[]rotated=new int[n];
        for(int i=0;i<k;i++){
            rotated[i]=a[n-k+i];
        }
        for(int i=0;i<n-k;i++){
            rotated[k+i]=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=rotated[i];
        }
    }
}

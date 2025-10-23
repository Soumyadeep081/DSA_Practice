package Matrix;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //48. Rotate Image:
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int[][]a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        f(a);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
    private static void f(int[][]a){
        int n=a.length;
        int i=0;
        int j=n-1;

        while(i<j){
            for(int col=0;col<n;col++){
                int temp=a[i][col];
                a[i][col]=a[j][col];
                a[j][col]=temp;
            }
            i++;
            j--;
        }
        for(int row=0;row<n;row++){
            for(int col=row+1;col<n;col++){
                int temp=a[row][col];
                a[row][col]=a[col][row];
                a[col][row]=temp;
            }
        }
    }
}

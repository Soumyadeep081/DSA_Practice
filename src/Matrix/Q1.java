package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Spiral Matrix:
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int[][]a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
            int m=matrix.length,n=matrix[0].length;
            int top=0,bottom=m-1,left=0,right=n-1;
            List<Integer> ll=new ArrayList<>();
            while(top<=bottom && left<=right){
                for(int i=left;i<=right;i++){
                    ll.add(matrix[top][i]);
                }
                top++;
                for(int i=top;i<=bottom;i++){
                    ll.add(matrix[i][right]);
                }
                right--;
                if(top<=bottom){
                    for(int i=right;i>=left;i--){
                        ll.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if(left<=right){
                    for(int i=bottom;i>=top;i--){
                        ll.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            return ll;
        }



}

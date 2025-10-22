package Matrix;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //Search in a 2D matrix:
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int[][]a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        int target=input.nextInt();
        System.out.println(f(a,target));
    }
    //TC:O(m*n):
    private static boolean f(int[][]matrix,int target){
        int top=0;
        int bot=matrix.length-1;

        while(top<=bot){
            int mid=(top+bot)/2;
            if(matrix[mid][0]<target&&matrix[mid][matrix[mid].length-1]>target){
                break;
            }else if(matrix[mid][0]>target){
                bot=mid-1;
            }else{
                top=mid+1;
            }
        }

        int row=(top+bot)/2;
        int left=0;
        int right=matrix[row].length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return false;

    }
}

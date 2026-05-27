package Sliding_Window;

public class Q8 {
    public static void main(String[] args) {
        //Minimum swaps and K together:

        int[]arr={2, 7, 9, 5, 8, 7, 4};
        int k=6;

        int c=0;
        for(int num:arr){
            if(num<=k)c++;
        }
        int min=Integer.MAX_VALUE;
        int l=0,r=c-1;
        while(r<arr.length){
            int tot=0;
            for(int i=l;i<=r;i++){
                if(arr[i]>k)tot++;
            }
            min=Math.min(min,tot);
            l++;
            r++;
        }
        System.out.println(min);
    }
}

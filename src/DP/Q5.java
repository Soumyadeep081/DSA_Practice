package DP;

public class Q5 {
    public static void main(String[] args) {
        //Maximum Subarray Sum with One Operation:

        int[]arr={1,-2,3,4};

        int no=arr[0];
        int yes=2*arr[0];
        int res=Math.max(no,yes);

        for(int i=1;i<arr.length;i++){
            int prev=no;
            no=Math.max(no+arr[i],arr[i]);
            yes=Math.max(yes+arr[i],prev+2*arr[i]);

            res=Math.max(res,Math.max(yes,no));
        }

        System.out.println(res);
    }
}

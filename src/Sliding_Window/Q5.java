package Sliding_Window;

public class Q5 {
    public static void main(String[] args) {
        //413. Arithmetic Slices:

        int[]nums={1,3,5,7,9};

        int l=0,r=1;
        int ans=0;
        int diff=nums[r]-nums[r-1];
        r++;
        while(r<nums.length){
            if(nums[r]-nums[r-1]==diff){
                if(r-l+1>=3){
                    ans+=r-l-1;
                }
            }
            else{
                diff=nums[r]-nums[r-1];
                l=r-1;
            }
        }
        System.out.println(ans);
    }
}

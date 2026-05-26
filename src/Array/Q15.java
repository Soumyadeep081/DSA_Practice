package Array;

import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        //Factorials of large numbers:

        int n=10;

        List<Integer>ll=new ArrayList<>();
        ll.add(1);
        for(int x=2;x<=n;x++){
            int c=0;
            for(int i=ll.size()-1;i>=0;i--){
                int val=ll.get(i)*x+c;
                ll.set(i,val%10);
                c=val/10;
            }
            while(c>0){
                ll.add(0,c%10);
                c/=10;
            }
        }
        System.out.println(ll);
    }
}

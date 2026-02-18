package Strings;

public class Q10 {
    public static void main(String[] args) {
        //Add Binary:

        String a="1011";
        String b="1101";

        int i=a.length()-1,j=b.length()-1;
        int c=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0||c==1){
            if(i>=0)c+=a.charAt(i--)-'0';
            if(j>=0)c+=b.charAt(j--)-'0';
            sb.append(c%2);
            c/=2;
        }
        sb.reverse();
        int idx=0;
        while(idx<sb.length()-1&&sb.charAt(idx)=='0'){
            idx++;
        }
        System.out.println(sb.substring(idx));

    }
}

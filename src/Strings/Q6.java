package Strings;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Longest Palindromic Substring:
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println(f(s));
    }
    private static String f(String s){
        if(s==null||s.length()<1)return "";
        String res="";
        for(int i=0;i<s.length();i++){
            String p1=expand(s,i,i);
            String p2=expand(s,i,i+1);
            String longer=p1.length()>p2.length()?p1:p2;
            if(longer.length()>res.length())res=longer;
        }
        return res;
    }
    private static String expand(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);

    }
}

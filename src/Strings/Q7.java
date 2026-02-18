package Strings;

public class Q7 {
    public static void main(String[] args) {
        //Strings Rotations of Each Other:
        String s1="abcd";
        String s2="cdab";

        //App 1: Gives TLE:
        for(int i=0;i<s1.length();i++){
            if(s1.equals(s2)){
                System.out.println(true);
                return;
            }
            char last=s1.charAt(s1.length()-1);
            s1=last+s1.substring(0,s1.length()-1);
        }
        System.out.println(false);

    }
}

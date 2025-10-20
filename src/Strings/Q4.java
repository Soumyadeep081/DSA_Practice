package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //String Duplicates Removal:
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println(removeDuplicates(s));
    }
   public static String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        HashSet<Character> hs=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(hs.contains(ch))continue;
            else{
                hs.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}

package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //Calculate Frequency of characters in a String:

        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        f(s);
    }
    private static void f(String s){
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(Character.isWhitespace(ch))continue;
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:hm.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
    }
}

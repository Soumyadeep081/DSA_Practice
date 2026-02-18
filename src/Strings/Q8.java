package Strings;

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        //Check if 2 strings are anagrams of each other or not:

        String s1="geeks";
        String s2="skeeg";

        if(s1.length()!=s2.length()) {
            System.out.println(false);
            return;
        }
        HashMap<Character,Integer> hm=new HashMap<>();

        for(char ch:s1.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:s2.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)-1);
        }
        for(Map.Entry<Character,Integer>entry:hm.entrySet()){
            if(entry.getValue()!=0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        
    }
}

package Strings;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //Count number of vowels, consonants, spaces in String:
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        f(s);
    }
    private static void f(String s){
        int vow=0,con=0,spaces=0;
        for(char ch:s.toCharArray()){
            ch=Character.toLowerCase(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')vow++;
            else if(ch>='a'&&ch<='z') con++;
            else if(Character.isWhitespace(ch))spaces++;
        }
        System.out.println("Spaces: "+spaces+" Consonant: "+con+" Vowel: "+vow);
    }
}

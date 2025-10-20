package Strings;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //Count the number of words in a given string:
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println(s);
        System.out.println(f(s));
    }
    private static int f(String s){
        String[]str=s.split("\\s+");
        return str.length;
    }
}

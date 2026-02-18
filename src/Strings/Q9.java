package Strings;

import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        //Panagram Checking:

        String s="Bawds jog, flick quartz, vex nymph";
        HashSet<Character>hs=new HashSet<>();
        for(char ch:s.toCharArray()){
            ch=Character.toLowerCase(ch);
            if(Character.isLetter(ch))
                hs.add(ch);
        }
        System.out.println(hs.size()==26);
    }
}

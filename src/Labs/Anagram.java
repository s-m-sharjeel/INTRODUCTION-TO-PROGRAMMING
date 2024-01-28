package Labs;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        boolean same=true;
        int length=0;
        int ok=0;
        
        Scanner input = new Scanner(System.in);
        
        String s1;
        String s2;
        
        do{
            System.out.print("Please enter a word: ");
            s1 = input.next();
        
            System.out.print("Please enter the next word: ");
            s2 = input.next();
        
            if(s1.length() != s2.length()){
                System.out.println("The length of both words must be same!\nPlease try again!");
                same=false;
            }else{length=s1.length();}
        
        }while(!same);
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        for (int i = 0; i < length ; i++) {
            for (int j = i; j < length ; j++) {
                if (s1.charAt(i) == s2.charAt(j)){
                    s2 = s2.charAt(j) + s2.substring(0, j) + s2.substring(j + 1);
                    ok++;
                    break;
                }
            }
                
        }

        if (ok == length) {
            System.out.println("It is an anagram. ");
        } else {
            System.out.println("It is not an anagram. ");
        }

    }
    
}

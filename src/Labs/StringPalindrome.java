package Labs;

import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String str = input.next();
        String word = str.toUpperCase();
        
        int num = word.length();
        boolean palindrome = true;
        
        for (int i = 0; i < (num/2); i++) {

            if ((word.charAt(i)) != (word.charAt(num - 1 - i))) {
                palindrome = false;
                break;
            }
            
        }
        
        if (palindrome)
            System.out.println(str + " is a palindrome word.");
        else System.out.println(str + " is not a palindrome word.");
        
    }
    
}

package Labs;

import java.util.*;

public class AlphaNumeric {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        
        System.out.println("Alphanumerics: ");
        
        String[] arr = str.split(" ");

        for (String s : arr) {

            boolean alphabet = false;
            boolean number = false;

            for (int j = 0; j < s.length(); j++) {

                if ((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z') || (s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z'))
                    alphabet = true;

                if ((s.charAt(j) >= '0') && (s.charAt(j) <= '9'))
                    number = true;


            }

            if (alphabet && number)
                System.out.print(s + " ");

        }
        
    }
    
}

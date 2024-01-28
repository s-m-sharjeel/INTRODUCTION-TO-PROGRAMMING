package Labs;

import java.util.*;

public class HexaDecimal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a Hexadecimal digit: ");
        char digit = input.next().charAt(0);
        
        if((digit<58)&&(digit>47))
                System.out.println("Number in decimal system: "+(digit-48)); 
        else if((digit>64)&&(digit<71))
                System.out.println("Number in decimal system: "+(digit-55));
        else System.out.println("Not a valid input");
        
    }
    
}

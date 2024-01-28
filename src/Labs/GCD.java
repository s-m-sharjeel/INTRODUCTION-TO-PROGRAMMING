package Labs;

import java.util.*;

public class GCD {

    public static void main(String[] args) {
        
        int i;
        int gcd=0;
        int smaller;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("num1 = ");
        int num1 = input.nextInt();
        
        System.out.print("num2 = ");
        int num2 = input.nextInt();

        smaller = Math.min(num1, num2);
            
        for(i=1;i<smaller;i++){
            if ((num1%i==0)&&(num2%i==0))
                gcd=i;
            }
        System.out.println("output : GCD is " + gcd);
    }    
    
}

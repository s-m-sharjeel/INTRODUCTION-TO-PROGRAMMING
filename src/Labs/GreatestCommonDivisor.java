package Labs;

import java.util.*;

public class GreatestCommonDivisor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println("GCD: "+gcd(a,b));
        
    }
    
    public static int gcd(int a, int b){
        
        if(a==0)
            return b;
        if(b==0)
            return a;
        
        return gcd(b%a,a);
        
    }
    
}

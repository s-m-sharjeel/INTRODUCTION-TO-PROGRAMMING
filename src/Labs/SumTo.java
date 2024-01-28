package Labs;

import java.util.*;

public class SumTo {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        
        System.out.println("sum to "+sumTo(n));
        
    }
    
    public static double sumTo(double n){
        
        if(n>1){
            return (1/n)+sumTo(n-1);
        }
        
        return 1;
        
    }
    
}

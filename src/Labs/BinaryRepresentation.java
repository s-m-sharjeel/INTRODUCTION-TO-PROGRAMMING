package Labs;

import java.util.*;

public class BinaryRepresentation {

    public static void main(String[] args) {
        
        int i = 1, digit, code = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        
        do{
            if (num % 2==0)
                digit = 0;
            else digit = 1;
            
            code = code+(digit*i);
                
                num = num/2;
                
                i=i*10;
                
            } while(num>0);
        
            System.out.println(code);
              
        }
        
    }
    

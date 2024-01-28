package Labs;

import java.util.*;

public class PalindromeN {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int sum=0;
        int num;
        int rem;
        
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        
        do{
            rem = num%10;
            num = num/10;
            sum = (sum*10)+rem;
            
        }while(num>0);
        
        if(sum==num)
            System.out.println("Your number is a Palindrome");
        else System.out.println("Your number is not a Palindrome");
        
    }

}

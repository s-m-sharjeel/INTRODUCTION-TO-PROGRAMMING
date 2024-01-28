package Labs;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please enter the four-digit number: ");
        int num = input.nextInt();
        
        int d1 = (num-(num%1000))/1000;
        int d2 = ((num%1000)-(num%100))/100;
        int d3 = ((num%100)-(num%10))/10;
        int d4 = num%10;
        
        int newNum = ((d4*1000)+(d3*100)+(d2*10)+(d1));
        
        System.out.println("The reverse number is: " + newNum);
        
        if(num == newNum)
            System.out.println("PALINDROME");
        else System.out.println("NOT A PALINDROME");
            
        }
                
    }
    

package Labs;

import java.util.*;

public class MessageSum {

    public static void main(String[] args) {
        
        int sum=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a string: ");
        String message = input.nextLine();
        
        for (int i = message.length()-1; i >= 0 ; i--) {

            if((message.charAt(i)>48)&&(message.charAt(i)<58)){
                if(message.charAt(i)%2!=0)
                    sum= sum+((message.charAt(i))-48);
            } 
            
        }
        
        System.out.println(sum);
        
    }
    
}

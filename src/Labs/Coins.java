package Labs;

import java.util.*;

public class Coins {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        boolean wrong = true;
        
        do{
            try{
                boolean correct = false;
                do{
                    System.out.print("Enter a number: ");
                    num = input.nextInt();
                    if(num>=0&&num<=511)
                        correct = true;
                    else System.out.println("Your number is out of range! ");
                }while(!correct);
                
                wrong = false;
            }
            catch(InputMismatchException ex){
                System.out.println("Wrong input!");
                System.out.println("Please try again!");
                input.nextLine();
            }
        }while(wrong);
        
        int temp = num;
        String binary = "";
        
        for (int i = 8; i >= 0; i--) {
            if((temp/(int)(Math.pow(2, i)))!=0){
                temp = temp - (int)(Math.pow(2, i));
                binary = binary + "1";
            }else
                binary = binary + "0";
            
        }

        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(binary.charAt(k)=='0')
                    System.out.print("H ");
                else System.out.print("T ");
                k++;
            }
            System.out.println();
        }
        
    }
    
    
}

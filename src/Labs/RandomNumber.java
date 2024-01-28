package Labs;

import java.util.*;

public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        int num=0;
        char ans;
        
        Scanner input = new Scanner(System.in);
        
        do{
            
            int random = (int) (Math.random()*101);
            
            for(i=1;(i<6);i++){
            System.out.print("Enter your guess : ");
            num = input.nextInt();
            if(num>random)
                System.out.println("too high");
            else if(num<random)
                System.out.println("too low");
            else break;
            }
        
            if(num==random)
                System.out.println("Congratulations ...you guess in " + i + " attempt");
            else System.out.println("You're out of attempts");
        
            System.out.println("If you want to continue, press A");
            ans = input.next().charAt(0);
        
        }while(ans=='a' || ans=='A');
        
        
        
    }
    
}

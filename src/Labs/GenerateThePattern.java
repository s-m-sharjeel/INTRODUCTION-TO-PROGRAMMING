package Labs;

import java.util.*;

public class GenerateThePattern {

    public static void main(String[] args) {
        
        int sum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            sum=0;
            
            for (int j = 1; j <= i; j++) {
                if(i==j)
                    System.out.print(j+" ");
                else System.out.print(j+" + ");    
                sum=sum+j;
            }
            System.out.println("= "+sum);
        }
        
    }
    
}

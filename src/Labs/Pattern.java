package Labs;

import java.util.*;

public class Pattern {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            for (int j = num-i; j >0 ; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            
            for (int j = i-1; j > 0; j--) {
                System.out.print(j);
            }
            
            System.out.println();
            
        }
    }
    
}

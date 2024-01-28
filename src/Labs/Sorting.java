package Labs;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the length of your array: ");
        int length = input.nextInt();
        
        int[] arr = new int[length];
        System.out.println("Please enter the values for your array: "); 
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            
        }
        
        int temp;
        
        for (int i = 0; i < arr.length-1; i++) {
            
            for (int j = i+1 ; j < arr.length; j++) {
                
                if(arr[i]>arr[j]){
                    
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                            
                }
                
            }
            
        }
        
        System.out.println("Answer: ");

        for (int j : arr) {
            System.out.println(j);

        }
        
    }
    
}

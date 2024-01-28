package Labs;

import java.util.*;

public class Insertion {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of elements <= 20");
        int length = input.nextInt();
        
        int[] arr = new int[21];
        System.out.println("Enter "+length+" elements in ascending order "); 
        
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
            
        }
        
        System.out.println("Enter the element to be inserted : ");
        int element = input.nextInt();

        insertion(arr, length, element);

        System.out.println("Array after insertion is");
        
        for (int j = 0; j <= length ; j++) {
            System.out.print(arr[j]+" ");
            
        }
        
    }
    
    public static void insertion(int[] arr, int length, int element){
        
        int i=0;
        
        while(element>arr[i]){
            i++;
        }
        
        for (int j = length ; j > i; j--) {
            arr[j] = arr[j-1];
            
        }
        
        arr[i] = element;
        
    }
    
}

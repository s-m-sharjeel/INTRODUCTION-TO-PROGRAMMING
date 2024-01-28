package Labs;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the length of your array: ");
        int length = input.nextInt();
        
        int[] arr = new int[length];
        System.out.println("Please enter the values for your array: "); 
        
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.nextInt();
        
        int temp;
        int j=0;
        
        while(j<5){
            
            for (int i = 0; i < arr.length-1-j; i++) {
                if(arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            
            j++;
            
        }
        
        System.out.println("Answer: ");

        for (int k : arr) {
            System.out.println(k);
        }
        
    }
}

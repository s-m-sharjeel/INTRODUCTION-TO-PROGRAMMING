package Labs;

import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a1=0;
        int a2=0;
        int a3=0;
        
        System.out.print("Please enter the length of your array 1: ");
        int length1 = input.nextInt();
        
        int[] arr1 = new int[length1];
        System.out.println("Please enter the values for your array 1: "); 
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }
        
        System.out.print("Please enter the length of your array 2: ");
        int length2 = input.nextInt();
        
        int[] arr2 = new int[length2];
        System.out.println("Please enter the values for your array 2: "); 
        
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }
        
        int[] arr3 = new int[arr1.length+arr2.length];
        
        while(a1<arr1.length&&a2<arr2.length){
            if(arr1[a1]<=arr2[a2]){
                arr3[a3]=arr1[a1];
                a1++;
                a3++;
            }else{
                arr3[a3]=arr2[a2];
                a2++;
                a3++;
            }
                
        }
        
        if(a1==arr1.length){
            while(a2<arr2.length){
                arr3[a3]=arr2[a2];
                a2++;
                a3++;
            }
        }else{
            while(a1<arr1.length){
                arr3[a3]=arr1[a1];
                a1++;
                a3++;
            }
        }
            
        System.out.println("Answer: ");

        for (int j : arr3) {
            System.out.println(j);
        }
    }
    
}

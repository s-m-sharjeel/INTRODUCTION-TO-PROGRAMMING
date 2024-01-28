package Labs;

public class Centered {
    
    public static void main(String[] args) {
        
        int[] centeredArray = { 1 , 2 , 3 , 4 , 100 };
        for (int j : centeredArray) {
            System.out.print(j + " ");

        }
        
        int min = centeredArray[0];
        int max = centeredArray[0];
        
        for (int i = 1; i < centeredArray.length; i++) {
            
            if(centeredArray[i]>max)
                max = centeredArray[i];

        }
        
        int sum = 0;

        for (int j : centeredArray) {
            sum += j;

        }
        
        sum = sum - (max + min);
        System.out.println("\nAverage: " + (sum/(centeredArray.length-2)));
        
    }
    
}

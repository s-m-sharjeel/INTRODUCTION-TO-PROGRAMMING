package Final_Lab;
import java.util.*;

public class Task_1 {


    public static void main(String[] args) {

        /*
        inputs a square matrix of m rows and columns from the user,
        and divides it into small boxes of size p (where p < m);
        then it sums all element contained in that box,
        and creates a new matrix out of those sums of each box.
         */
        
        Scanner input = new Scanner(System.in);
        
        int m = 0;
        boolean correct = false;

        // taking input m
        do{
            try{
                System.out.print("Enter m: ");
                m = input.nextInt();
                correct = true;
            }catch(Exception ex){
                System.out.println("Invalid input!");
                System.out.println("Please try again!");
                input.nextLine();
            }
        }while(!correct);

        int[][] square = new int[m][m];
        
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print("("+i+","+j+"): ");
                square[i][j] = input.nextInt();
                
            }
            
        }
        
        display(square);
        
        int p = 0;

        // taking input p
        do{
            correct = false;
            try{
                System.out.print("Enter p: ");
                p = input.nextInt();
                if (p > m)
                    throw new Exception("p must be less than m!");
                correct = true;
            }catch(Exception ex){
                System.out.println("Invalid input!");
                System.out.print("Please try again: ");
                input.nextLine();
            }
        }while(!correct);
        
        int[][] newSquare = new int[p][p];
        
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                // initializing the sum for each element as zero
                newSquare[i][j] = 0;
                for (int k = i*(m/p); k < (i*(m/p))+p; k++) {
                    for (int l = j*(m/p); l < (j*(m/p))+p; l++) {
                        // adding to the sum
                        newSquare[i][j]+=square[k][l];
                    }
                    
                }
            }
        }
        
        display(newSquare);
        
    }

    /**
     * displays the array
     * @param arr is the array to be displayed
     */
    public static void display(int[][] arr){

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();
        }
        
    }
    
}

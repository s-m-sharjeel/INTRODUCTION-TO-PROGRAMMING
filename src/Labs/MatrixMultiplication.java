package Labs;

import java.util.*;

public class MatrixMultiplication {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int r1;
        int c1;
        int r2;
        int c2;
        int[][] m1;
        int[][] m2;
        
        do{
            System.out.println("Please enter the rows and columns of the first matrix: ");
            r1 = input.nextInt();
            c1 = input.nextInt();

            m1 = randomMatrix(r1,c1);

            System.out.println("Please enter the rows and columns of the second matrix: ");
            r2 = input.nextInt();
            c2 = input.nextInt();

            m2 = randomMatrix(r2,c2);
            
        }while(c1!=r2);
        
        System.out.println("Matrix one: ");
        display(m1,r1,c1);
        
        System.out.println("Matrix two: ");
        display(m2,r2,c2);
        
        int r3 = r1;
        int c3 = c2;
        
        int[][] m3 = new int[r3][c3];
        
        for (int i = 0; i < r3; i++) {
            
            for (int j = 0; j < c3; j++) {
                
                for (int k = 0; k < r2; k++) {
                    
                    m3[i][j] += (m1[i][k])*(m2[k][j]); 
                    
                }
                
            }
            
        }
        
        System.out.println("Matrix three: ");
        display(m3,r3,c3);
        
        System.out.println("Transpose of matrix one: ");
        display(transpose(m1,r1,c1),r1,c1);
        
    }
    
    public static int[][] randomMatrix(int rows, int columns){
    
        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (int)(Math.random()*10);

            }

        }
        
        return arr;
        
    }
    
    public static void display(int[][] arr, int rows, int columns){
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }
        
    }
    
    public static int[][] transpose(int[][] m, int rows, int columns){
        
        for (int i = 0; i < rows; i++) {
            for (int j = i ; j < columns; j++) {
                
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
                
            }
            
        }
        
        return m;
    }
    
}

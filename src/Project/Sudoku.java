package Project;

import java.util.*;

public class Sudoku {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[][] initialBoard = {
                { 5 , 3 , 0 , 0 , 7 , 0 , 0 , 0 , 0 } ,
                { 6 , 0 , 0 , 1 , 9 , 5 , 0 , 0 , 0 } ,
                { 0 , 9 , 8 , 0 , 0 , 0 , 0 , 6 , 0 } ,
                { 8 , 0 , 0 , 0 , 6 , 0 , 0 , 0 , 3 } ,
                { 4 , 0 , 0 , 8 , 0 , 3 , 0 , 0 , 1 } ,
                { 7 , 0 , 0 , 0 , 2 , 0 , 0 , 0 , 6 } ,
                { 0 , 6 , 0 , 0 , 0 , 0 , 0 , 0 , 0 } ,
                { 0 , 0 , 0 , 4 , 1 , 9 , 0 , 0 , 5 } ,
                { 0 , 0 , 0 , 0 , 8 , 0 , 0 , 7 , 9 }
            };

        System.out.println("WELCOME TO SUDOKU!\n");
        
        displayBoard(initialBoard);

        int[][] board = {
                { 5 , 3 , 0 , 0 , 7 , 0 , 0 , 0 , 0 } ,
                { 6 , 0 , 0 , 1 , 9 , 5 , 0 , 0 , 0 } ,
                { 0 , 9 , 8 , 0 , 0 , 0 , 0 , 6 , 0 } ,
                { 8 , 0 , 0 , 0 , 6 , 0 , 0 , 0 , 3 } ,
                { 4 , 0 , 0 , 8 , 0 , 3 , 0 , 0 , 1 } ,
                { 7 , 0 , 0 , 0 , 2 , 0 , 0 , 0 , 6 } ,
                { 0 , 6 , 0 , 0 , 0 , 0 , 0 , 0 , 0 } ,
                { 0 , 0 , 0 , 4 , 1 , 9 , 0 , 0 , 5 } ,
                { 0 , 0 , 0 , 0 , 8 , 0 , 0 , 7 , 9 }
            };

        boolean filled;
        
        do{
                System.out.print("Please enter the number you want to insert: ");
            int num = input.nextInt();

            System.out.println("Please enter the row and column in which you want to insert a number: ");
            System.out.print("Row: ");
            int row = input.nextInt();
            System.out.print("Column: ");
            int column = input.nextInt();

            row--;
            column--;

            if(initialBoard[row][column]!=0){
                System.out.println("You cannot overwrite this number.");
                System.out.println("Please try again!");
            }else if(!row(num, board, row)){
                System.out.println("There is already a "+num+" in row "+(row+1)+".");
                System.out.println("Please try again!");
            }else if(!column(num, board, column)){
                System.out.println("There is already a "+num+" in column "+(column+1)+".");
                System.out.println("Please try again!");
            }else if(!box(num, board, row, column)){
                System.out.println("There is already a "+num+" in that square.");
                System.out.println("Please try again!");
            }else{
                board[row][column] = num;
                System.out.println("Your number "+num+" has been inserted!");
            }

            System.out.println("\nBOARD: \n");

            displayBoard(board);
            
            filled = true;
            
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if(board[i][j] == 0){
                        filled = false;
                        break;
                    }
                    
                }
                if(!filled)
                    break;
                
            }
            
        }while(!filled);
        
        System.out.println("CONGRATULATIONS!");
        
    }

    public static boolean column(int num, int[][] arr, int column){
        
        boolean allow = true;
        
        for (int i = 0; i < 9; i++) {
            if (num == arr[i][column]) {
                allow = false;
                break;
            }
            
        }
        return allow;
        
    }
    
    public static boolean row(int num, int[][] arr, int row){
        
        boolean allow = true;
        
        for (int i = 0; i < 9; i++) {
            if (num == arr[row][i]) {
                allow = false;
                break;
            }
            
        }
        return allow;
        
    }
    
    public static boolean box(int num, int[][] arr, int row, int column){
        
        boolean allow = true;
        
        for (int i = row - (row%3) ; i < (row - (row%3))+3; i++) {
            for (int j = column - (column%3); j < (column - (column%3))+3; j++) {
                if(num == arr[i][j]){
                    allow = false;
                    break;
                }
            }
        }
        
        return allow;
        
    }

    public static void displayBoard(int[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]+"");
            }
            System.out.println();
            System.out.println();
        }

    }
    
}
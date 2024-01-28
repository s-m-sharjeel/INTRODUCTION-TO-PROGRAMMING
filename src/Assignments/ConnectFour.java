package Assignments;

import java.util.*;

public class ConnectFour {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("WELCOME TO CONNECT FOUR!\n");
        
        char[][] grid = new char[6][7];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                grid[i][j] = 'O';
            }
        }
        
        System.out.println("GRID: \n");
        
        display(grid);
        System.out.println();
        
        boolean complete;
        boolean winner = false;
        
        do{
            System.out.println("Red's turn! ");
            System.out.print("In which column do you want to drop your token? ");

            boolean correct = false;
            int col1 = 0;
            
            do{
                try{
                    col1 = input.nextInt()-1;
                    while(grid[0][col1]!='O'){
                        System.out.println("The column is complete, Please try again!");
                        col1 = input.nextInt()-1;
                    }
                    correct = true;
                }
                catch(Exception ex){
                    System.out.println("The column you entered does not exist! ");
                    System.out.println("Please try again!");
                    input.nextLine();
                }
                
            }while(!correct);
            
            insert(grid,'R',col1);

            System.out.println();
            display(grid);
            System.out.println();
            
            if(verticalCheck(grid,'R')||horizontalCheck(grid,'R')||diagonalCheck(grid,'R')){
                System.out.println("RED IS THE WINNER!");
                winner = true;
                break;
            }

            System.out.println("Yellow's turn! ");
            System.out.print("In which column do you want to drop your token? ");

            correct = false;
            int col2 = 0;
            
            do{
                try{
                    col2 = input.nextInt()-1;
                    while(grid[0][col2]!='O'){
                        System.out.println("The column is complete, Please try again!");
                        col2 = input.nextInt()-1;
                    }
                    correct = true;
                }
                catch(Exception ex){
                    System.out.println("The column you entered does not exist! ");
                    System.out.println("Please try again!");
                    input.nextLine();
                }
                
            }while(!correct);

            insert(grid,'Y',col2);

            System.out.println();
            display(grid);
            System.out.println();
            
            if(verticalCheck(grid,'Y')||horizontalCheck(grid,'Y')||diagonalCheck(grid,'Y')){
                System.out.println("YELLOW IS THE WINNER!");
                winner = true;
                break;
            }
            
            complete = true;
            
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    if (grid[i][j] == 'O') {
                        complete = false;
                        break;
                    }
                }
            }
            
        }while(!complete);
        
        if(!winner)
            System.out.println("DRAW!");
        
    }
    
    public static void display(char[][] arr){

        for (char[] chars : arr) {
            for (char aChar : chars) {
                System.out.print(aChar + "  ");
            }
            System.out.println();
        }
    }
    
    public static void insert(char[][] arr, char token, int column){
        
        for (int i = 5; i >= 0; i--) {
            if(arr[i][column]=='O'){
                arr[i][column] = token;
                break;
            }
        }

    }
    
    public static boolean verticalCheck(char[][] arr, char token){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    if(arr[i+k][j]==token)
                        count++;
                }
                if(count==4)
                    return true;
            }
        }
        return false;
    }
    
    public static boolean horizontalCheck(char[][] arr, char token){
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    if(arr[i][j+k]==token)
                        count++;
                }
                if(count==4)
                    return true;
            }
        }
        return false;
    }
    
    public static boolean diagonalCheck(char[][] arr, char token){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    if(arr[i+k][j+k]==token)
                        count++;
                }
                if(count==4)
                    return true;
            }
        }
        
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    if(arr[i-k][j+k]==token)
                        count++;
                }
                if(count==4)
                    return true;
            }
        }
        
        return false;
    }
    
}

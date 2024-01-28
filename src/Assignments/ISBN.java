package Assignments;

import java.util.*;

public class ISBN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean flag = false;
        int code = 0;

        do {
            try {
                // taking input from the user
                System.out.print("Enter the nine-digit code: ");
                code = input.nextInt();
                //checking if code contains 9 digits
                if (code > 999999999 || code < 100000000)
                    throw new RuntimeException("Code should contain nine digits!");
                //no error encountered
                flag = true;
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("Please try again!");
            }
        } while (!flag);

        int d1;
        int d2 = code%10;
        int d3 = (code%100)/10;
        int d4 = (code%1000)/100;
        int d5 = (code%10000)/1000;
        int d6 = (code%100000)/10000;
        int d7 = (code%1000000)/100000;
        int d8 = (code%10000000)/1000000;
        int d9 = (code%100000000)/10000000;
        int d10 = (code%1000000000)/100000000;

        int x = ((d2*92)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9)+(d10*10))%11;

        if (x == 0)
            d1 = x;
        else d1 = 11-x;

        System.out.print("ISBN code: ");
        System.out.println(code + "" + d1);

    }

}






package Assignments;

import java.util.*;

public class Ramanujan {

    public static void main(String[] args) {
        
        int i, j, x, a, b, c, d;
        x = a = b = c = d = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        
        for(i=0;i<=num;i++){
            for(j=0;j<=num;j++){
                x = (i*i*i)+(j*j*j);
                if(x==num)
                    break;
            }
            if(x==num){
                a=i;
                b=j;
                break;
            }
        }
        
        for(i=a+1;i<=num;i++){
            for(j=0;j<=num;j++){
                x = (i*i*i)+(j*j*j);
                if(x==num)
                    break;
            }
            if(x==num){
                c=i;
                d=j;
                break;
            }
        }

        if ((a == 0 && b == 0 && c == 0 && d == 0) && num != 0) {
            System.out.println("It is not expressible as the sum of two cubes in two different ways:");
            return;
        }

        
        System.out.println("It is expressible as the sum of two cubes in two different ways:");
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        System.out.println(num+"=("+a+"^3)+("+b+"^3)=("+c+"^3)+("+d+"^3)");
        
    }
}
        

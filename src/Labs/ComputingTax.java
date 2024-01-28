package Labs;

import java.util.*;
public class ComputingTax {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the annual income: ");
        
        int amount = input.nextInt();
        
        System.out.println("Press 1 for Single");
        System.out.println("Press 2 for Married Filing Jointly/Qualifying Widow(er)");
        System.out.println("Press 3 for Married Filing Separately");
        System.out.println("Press 4 for Head of Household");
        
        int x = input.nextInt();
        
        int taxrate=0;
        
        switch(x){
            case 1 : { 
                if(amount>372950)
                    taxrate=35;
                else if(amount>171550)
                    taxrate=33;
                else if(amount>82250)
                    taxrate=28;
                else if(amount>33950)
                    taxrate=25;
                else if(amount>8350)
                    taxrate=15;
                else taxrate=10;
                break;
            }
            case 2 : {
                if(amount>372950)
                    taxrate=35;
                else if(amount>208850)
                    taxrate=33;
                else if(amount>137050)
                    taxrate=28;
                else if(amount>67900)
                    taxrate=25;
                else if(amount>16700)
                    taxrate=15;
                else taxrate=10;
                break;
            }
            case 3 : {
                if(amount>186475)
                    taxrate=35;
                else if(amount>104425)
                    taxrate=33;
                else if(amount>68525)
                    taxrate=28;
                else if(amount>33950)
                    taxrate=25;
                else if(amount>8350)
                    taxrate=15;
                else taxrate=10;
                break;
            }
            case 4 : {
                if(amount>372950)
                    taxrate=35;
                else if(amount>190200)
                    taxrate=33;
                else if(amount>117450)
                    taxrate=28;
                else if(amount>45500)
                    taxrate=25;
                else if(amount>11950)
                    taxrate=15;
                else taxrate=10;
                break;
            }
            default : {
                System.out.println("Wrong Input");
                System.exit(1);
            }
            
        }
        
        System.out.println("The amount of tax to be paid: " + (amount*taxrate)/100);
        System.out.println("The amount after tax deduction: " + (amount-(amount*taxrate)/100));
        
    }
    
}

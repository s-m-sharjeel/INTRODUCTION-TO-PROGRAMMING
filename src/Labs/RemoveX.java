package Labs;

import java.util.*;

public class RemoveX {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String str = input.next();
        
        System.out.println("After removing x: "+removeX(str));
        
        System.out.println("The number of x's removed: "+((str.length())-(removeX(str).length())));
        
    }
    
    public static String removeX(String str){
        
        if(str.length()==1){
            if(str.charAt(0)=='x'){
                return "";
            }else
                return str;
        }
        
        if(str.charAt(0)=='x')
            return removeX(str.substring(1));
        else
            return str.charAt(0)+removeX(str.substring(1));
            
            
    }
}

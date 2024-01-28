package Final_Lab;
import java.util.*;

public class Task_2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("s1: ");
        String s1 = input.next();
        System.out.print("s2: ");
        String s2 = input.next();
        
        while (s1.length() != s2.length()){
            System.out.println("Please try again!");
            System.out.print("s1: ");
            s1 = input.next();
            System.out.print("s2: ");
            s2 = input.next();
        }
        
        int length = s1.length();
            
        boolean found = false;
        
        for (int i = 0; i < length; i++) {

            if (s1.substring(i).equals(s2.substring(0, length - i))) {
                found = true;
                break;
            }
            
        }
        
        if(found)
            System.out.println("True");
        else System.out.println("False");
        
    }
    
}

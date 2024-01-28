package Final_Lab;
public class Task_3 {
    
    public static void main(String[] args) {

        // testing
        for (int i = 1; i <= 9; i++) {
            System.out.println(S(i));
        }
        
    }

    /**
     * recursively creates a string from 1 to a given number
     * @param n is the given number
     * @return a string from 1 to a given number
     */
    public static String S(int n){
        
        if(n<=0)
            return "";
        
        return S(n-1) + n;
        
    }
    
}

package Labs;

public class RandomLetters {

    public static void main(String[] args) {
        
        char[] arr = randomChar();
        int count;
        
        for (int i = 0; i < 26; i++) {
            count=0;
            
            for (int j = 0; j < 100; j++) {
                if(arr[j]==(97+i))
                    count++;
                
            }
            
            System.out.println("freq of character "+ (char)(97+i)+" is "+count );
            
        }
        
    }
    
    public static char[] randomChar() {
    
        char[] arr = new char[100];
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = (char)(97+Math.random()*26);
            
        }
        
        return arr;
    
    }
    
}

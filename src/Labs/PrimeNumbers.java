package Labs;

public class PrimeNumbers {

    public static void main(String[] args) {
        
        boolean prime;
        int num=2;
        int i=0;
        
        do{
            int f=0;
            do{
            prime=true;
            for (int k = 2; k < num; k++) {
                if (num % k == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.print(num+" ");
                i++;
                f++;
            }
            num++;
            }while(f<10);
            System.out.println();
                
        }while(i<50);
    }

}

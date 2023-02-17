import java.util.Scanner;

public class javatut12_5 {
    public static void main(String[] args) {
       System.out.println( sum(3, 4));
       System.out.println( sum(3.3f, 4.3f));
       System.out.println(  sum(3, 4, 4));
       System.out.println( sum(3.3f, 4.4f, 0));
       System.out.println( isprime(5));
       System.out.println(isprime(9));
       System.out.println(isprime(4));
       primerange(20);
    }
  
public static int sum(int a ,int b){
        return a+b;
    }
   public static float sum(float a ,float b){
        return a+b;
    }
   public static float sum(float a ,float b,float c){
        return a+b+c;
    }
   public static int sum(int a ,int b,int c){
        return a+b+c;
    }
    public static boolean isprime(int n){
        boolean isprime=true;
        for (int i=2;i<n;i++){
            
            if (n%i==0){
                isprime=false;
                break;//return isprime
            }
           
        }
        return isprime;
        
    }
    public static void primerange (int n ){
        for (int i=2;i<=n;i++){
            if (isprime(i)){
                System.out.println(i);
            }
        }System.out.println();
    }
}

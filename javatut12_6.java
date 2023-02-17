public class javatut12_6 {
    public static void main(String[] args) {
        bintodec(111);
        dectobin(8);
    }
    
    public static void bintodec(int n ){
       int i=0,dec=0;
       while (n>0){
        int rem=n%10;
        dec= dec+(rem*(int)Math.pow(2,i));
        n=n/10;
        i++;
       }
       System.out.println(dec);
    }
    public static void dectobin(int n){
         int i=0;
         int bin=0;
        while(n>0){ 
            int rem=n%2;
            bin=bin+rem*(int)Math.pow(10,i);
            n=n/2;
            i++;
        } 
        System.out.print(bin);
        
    }
}

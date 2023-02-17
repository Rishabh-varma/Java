import java.util.Scanner;

public class javatut12_4 {
    // public static void main(String[] args) {
       
    //     Scanner sc =new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int r=sc.nextInt();
    //    int i= n(n);
    //     System.out.println(i);
    //    int j=r (r);
    //     System.out.println(j);
    //    int k= nr(n,r);
    //     System.out.println(k);
    //    int l= binomialcoff(r,n);
    //     System.out.println(l);
        

    // }
    // public static int binomialcoff(int r ,int n){
    //     int bc=  n(n)/(nr(n, r)*r(r));
    //     return bc;
    // }
    

    // public static int n(int n){
    //     int fact =1;
    //    for (int i=1;i<=n;i++){
    //        fact=fact*i;
    //     }
    //  return fact;
    // }
    // public static int nr(int n,int r  ){
    //     int fact =1;
    //    for (int i=1;i<= n-r;i++){
    //        fact=fact*i;
    //     }
    //  return fact;
    // }
    // public static int r (int r){
    //     int fact=1;
    //     for (int i=1; i<=r ; i++){
    //           fact=fact*i;
    //     }return fact;
    // }


    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int binomialcoff=binco(n, r);
        System.out.println(binomialcoff);

    }
    public static int binco(int n ,int r){
        int nfact=fact(n);
        int rfact=fact(r);
        int nrfact=fact(n-r);
        int binco=nfact/(rfact*nrfact);
        return binco;

    }
    public static int  fact(int a){
        int fact =1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
    
}

import java.util.Scanner;

public class javatut12_1 {
    // public static void main(String[] args) {
    //     sum();
    // }
    // public static void sum (){
    //     Scanner sc= new Scanner (System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int c=a+b;
    //     System.out.println(c);
    // }




    // public static void main(String[] args) {
    //     Scanner sc= new Scanner (System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     sum(a,b);
    // }
    // public static void sum(int a,int b){
    //     int c=a+b;
    //     System.out.println(c);
    //     return;
    // }


    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d =sum(a,b);//actual parameter or arguments 
        
        System.out.println(d);
    }
    public static int sum(int a,int b){//formal parameter
        int c=a+b;
        return c;
    }
}

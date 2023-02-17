import java.util.Scanner;

public class javatut12_3 {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner (System.in);
    //     int c=sc.nextInt();
    //     int d=sc.nextInt();
    //     mul(c, d);
    // }
    // public static void mul(int a, int b){
    //     int c=a*b;
    //     System.out.println(c);
    // }

        Scanner sc=new Scanner (System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        int prod=mul(c, d);
        System.out.println(prod);
    }
    public static int mul(int a, int b){
        int c=a*b;
        return c;
    }
}

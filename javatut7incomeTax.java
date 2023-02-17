import java.util.*;

public class javatut7incomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int income=sc.nextInt();
        int tax;
        if (income<500000){
          System.out.println("0 tax");
        }
        else if (500000<income &&income<1000000){
            tax=(int) (.2*income);
            System.out.println(tax);
        }
        else{
            tax=(int)(.3*income);
            System.out.println(tax);
        }

        //Greater of 3 nos
         int a=3,b=5,c=4;
         if (a>b &&a>c){
            System.out.println("a");
         }
         else if(b>c) {
              System.out.println("b");
         }
         else{
            System.out.println("c");
         }

    }
}

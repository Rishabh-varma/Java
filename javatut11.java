import java.util.*;
public class javatut11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        int n = sc.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        char ch='a';
        for (int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        for (int i=1; i<=n;i++){
          for (int k=1;k<n-i+1;k++)
              System.out.print(" ");

          for (int j=1;j <=(2*(n))-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}}

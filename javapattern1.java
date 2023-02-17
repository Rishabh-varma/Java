import java.util.Scanner;
public class javapattern1 {
   public static void main(String[] args) {
    System.out.print("enter the number of rows:");
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    for (int i=0;i<rows;i++){
        for (int j=0;j<rows;j++){
            System.out.print("*");
        }System.out.println();
    }
   }
}

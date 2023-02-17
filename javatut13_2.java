import java.util.*;
public class javatut13_2 {
    public static void main(String[] args) {
        int marks[]=new int [10];
        int numbers[]={12,23,3,4};
        String fruits[]={"apple","mango","guava"};
        Scanner sc =new Scanner(System.in);
        System.out.println("length of a array="+marks.length);
         marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
         marks[2]=sc.nextInt();
         System.out.println("a="+marks[0]);
         System.out.println("b="+marks[1]);
         System.out.println("c="+marks[2]);
        //  marks[2]=sc.nextInt();
        //  System.out.println("c="+marks[2]);
        // marks[2]=marks[2]+1;
        // System.out.println("c="+marks[2]);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println(percentage+"%");
    }
}

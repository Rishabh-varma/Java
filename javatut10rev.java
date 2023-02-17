import java.util.*;
public class javatut10rev {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // int count=0;
        // while (num>0){
        //     count=num%10;
        //     num=num/10;
        //     System.out.print(count);

        // }

// skip the multple of 10

        // do{
        //     int num=sc.nextInt();
        //     if(num%10==0){
        //         continue;
        //     }
            
        // System.out.println(num);
        // }
        // while(true);


// keep entering the number until user enter the multipke of 10 
        do{
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            
        System.out.println(num);
        }
        while(true);
    
    }
}

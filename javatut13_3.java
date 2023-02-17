import java.util.*;
public class javatut13_3 {
    public static void main(String[] args) {
        int marks[]={98,87,78};
        int nonchangable=5;
        System.out.println(nonchangable);//no change in the value
        update(marks,nonchangable);
        for(int i=0;i<marks.length;i++){
                System.out.println(marks[i]);}
    }
    public static void update(int marks[],int nonchangable){
        nonchangable=10;//call by referance
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

            }
        }
    }


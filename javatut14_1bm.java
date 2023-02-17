public class javatut14_1bm {
    public static void main(String[] args) {
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(6 >>1);
          oddoreven(3);
          oddoreven(4);
          System.out.println( getithbit(10, 2));
          System.out.println(setithbit(10, 2));
          System.out.println(clearithbit(10, 1));
          System.out.println(updateithbit(10, 2, 1)); 
          System.out.println(clearibits(15, 2));
          System.out.println(clrrangeofbits(10, 2, 4));
          System.out.println(ispoweroftwo(15));
          System.out.println(countsetbits(16 ));
          System.out.println(fastexponentiation(3, 4));

    }
    public static void oddoreven(int n){
        int bitmask =1;
        if ((n & bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
public static int getithbit(int n,int i){
    int bitmask=1<<i;
    if ((n &bitmask)==0){
        return 0; 
    }
    else{
        return 1;
    }

}
public static int setithbit(int n,int i){
    int bitmask=1<<i;
    return n|bitmask;
}
public static int clearithbit(int n ,int i){
    int bitmask=~(1<<i);
    return n&bitmask;
}
public static int updateithbit(int n, int i ,int newbit){
    // if (newbit ==0){
    //     return clearithbit(n, i);
    // }
    // else{
    //     return setithbit(n, i);
    // }
    n=clearithbit(n, i);
    int bitmask=newbit<<i;
    return n|bitmask;

}
public static int clearibits (int n , int i){

    int bitmask=(~0)<<i;
    return n&bitmask;
}
public static int clrrangeofbits(int n, int i, int j){
    int a=((~0)<<(j+1));
    int b=(1<<i)-1;
    int bitmask=a|b;
    return n&bitmask;
}
public static boolean ispoweroftwo(int n){
    return (n&(n-1))==0;
}
public static int countsetbits(int n ){
    int count =0;
    while(n>0){
        if ((n&1)!=0){
            count++;
        }
        n=n>>1;
    }
    return count;
}
public static int fastexponentiation(int a ,int n){
    int ans=1;
    while(n>0){
        if ((n&1)!=0){
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;
    }
    return ans;
}
}

public class javatut14 {
    
    public static void main(String[] args) {
        String firstname="rishabh";
        String lastname="verma";
        String fullname=firstname+lastname;
        System.out.println(fullname);
        String str="racecar";
        printletters(fullname);
        System.out.println( ispalindrome(str));
        String path="wneenesennn";
        System.out.println(getshortpath(path));
        String s ="helloworld";
        String s1="rishu";
        String s2="rishu";
        String s3=new String("rishu");
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if (largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
        // if(s1==s2){
        //     System.out.println("strings are equal");
        // }
        // else{
        //     System.out.println("strings sre not equal");
        // }
        // if(s1==s3){
        //     System.out.println("strings are equal");
        // }
        // else{
        //     System.out.println("strings sre not equal");
        // }
        
        if(s1.equals(s2)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings sre not equal");
        }
        if(s1.equals(s3)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings sre not equal");
        }
        ///////////////////
        System.out.println(substring(s, 2, 5));
        System.out.println(s.substring(2,5));

        //String builder
        StringBuilder sb=new StringBuilder("");
        for (char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        // TC=O(26)
        //in case of string TC=O(n^2)

        String st="hlo, i am rishu";
        System.out.println(stringtoUpperCase(st));
        String st2="aaaacccbbbsdjeee";
        System.out.println(compress(st2
        ));
        
    }
   
    public static void printletters(String name){
        for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean ispalindrome(String str){
        for (int i=0; i<str.length()/2;i++){
            int n=str.length();
            if (str.charAt(i)!=str.charAt(n-i-1)){
                //not a palindrome
                return false;
            }

        }
        return true;
    }
    public static float getshortpath(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
        if (dir=='s'){
            y--;
        }
        //north
        else if (dir=='n'){
            y++;
        }     
        //west
        else if(dir=='w'){
            x--;
        }
        //east
        else
         x++;
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
    }
    public static String substring(  String s, int si,int ei) {
         String substr="";
         for (int i=si;i<ei;i++){
             substr+=s.charAt(i);
         }return substr;
    }
     public static String  stringtoUpperCase(String st){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(st.charAt(0));
        sb.append(ch);
        for (int i=1;i<st.length();i++){
            if (st.charAt(i)==' '&& i<st.length()-1){
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
            }
            else{
                sb.append(st.charAt(i));
            }
        }
        return sb.toString();
     }
     public static String compress(String st){
        String newstr="";
        for (int i=0;i<st.length();i++){
            Integer count=1;
            while(i<st.length()-1 && st.charAt(i)==st.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=st.charAt(i);
            if (count>1){
                newstr+=count.toString();
            }
        }
        return newstr;
     }
}


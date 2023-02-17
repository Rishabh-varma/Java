public class javatut15_2polymorphism {
    public static void main(String[] args) {
        //method overloading 
        calculator cal=new calculator();
        System.out.println( cal.sum(2, 6));
        System.out.println( cal.sum(2.5f, 3.4f));
        System.out.println( cal.sum(2, 6,6));

        //method overriding 
        deer d=new deer();
        d.eat();
    }
}
// method overloading 
    class calculator {
    int sum (int a , int b){
        return a+b ;

    }
    int sum (int a, int b , int c){
        return a+b+c;
    }
    float sum (float a, float b){
        return a+b;
    }
}
 class animal {
    void eats(){
        System.out.println("eats ");
    }
 }
 class deer extends animal{
    void eat(){
        System.out.println("eats grass ");
    }
 }

//method overriding 




public class javatut15_1 {
    public static void main(String[] args) { 
        fish shark=new fish();
        shark.eat();
        shark.breathe();
        dog sheru =new dog();
        sheru.breathe();
        sheru.legs=4;
        System.out.println(sheru.legs);
        
    }
}
class Animal{
    String  color;
    void eat(){
        System.out.println( "eats");
    }
    void breathe (){
        System.out.println("breathes");
    }
}
class mammals extends Animal{
    int legs;

}
class dog extends mammals{
    String breed;
}
class fish extends Animal{
     int fins;
     void swims (){
        System.out.println( "swims");
     }
}
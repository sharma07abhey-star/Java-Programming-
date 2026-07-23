package Object_Oriented_Programming;
// Polymorphism  2. Run time
class Animals{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dogs extends Animals{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animals{
    @Override
    void sound(){
        System.out.println("Cat Meows");
    }
}
public class oop_11 {
    public static void main(String[] args){
        Animals a1 = new Dogs();
        Animals a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}
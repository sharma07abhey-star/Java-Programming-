package Object_Oriented_Programming;
// Inheritance
class Animal{
    String name;
    void eat(){
        System.out.println("Animal is eating food");
    }
}
class Dog extends Animal{
    void voice(){
        System.out.println("Dog is barking");
    }
}
public class oop_09 {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.name = "Dog";
        obj.eat();
        obj.voice();
        System.out.println("Name of the animal is : " + obj.name);
    }
}

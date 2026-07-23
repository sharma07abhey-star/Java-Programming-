package Object_Oriented_Programming;
// Polymorphism  1. compile time
class calculator{
    int add(int a , int b){
        return a + b;
    }
    double add(double a , double b){
        return a + b;
    }
}
public class oop_10 {
    public static void main(String[] args){
        calculator obj = new calculator();
        System.out.println("Integer sum is : " + obj.add(4,5));
        System.out.println("Double sum is : " + obj.add(4.5,5.5));
    }
}

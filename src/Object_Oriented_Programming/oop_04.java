package Object_Oriented_Programming;

// Represent a car with member variables name , color , gears and price .Initialize all the member variables
// using the constructor and print the values of all by defining another method print data .
import java.util.*;
class car2{
    String name;
    String color;
    int gears;
    int price;
    car2(String name , String color , int gears , int price){
        this.name = name;
        this.color = color;
        this.gears = gears;
        this.price = price;
    }
    public void display(){
        System.out.println("Name of the car is " + name);
        System.out.println("Color of the car is " + color);
        System.out.println("Gears in the car is " + gears);
        System.out.println("Price of the car is " + price);
    }
}
public class oop_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the car");
        String p = sc.nextLine();
        System.out.println("Enter color of the car");
        String q = sc.nextLine();
        System.out.println("Enter gears in the car");
        int r = sc.nextInt();
        System.out.println("Enter price of the car");
        int s = sc.nextInt();
        car2 c = new car2(p,q,r,s);
        c.display();
    }
}
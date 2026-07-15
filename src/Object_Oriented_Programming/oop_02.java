package Object_Oriented_Programming;

// represent a car using class with properties like name color and gears and price
// define a method inside a class to set the data in the above properties .
// similarly define one more method to print the data of the above member variables .
// Take input from user .

import java.util.*;
class car{
    String name;
    String color;
    int gears;
    int price;

    public void setdata(String p , String q , int r , int s){
        name = p;
        color = q;
        gears = r;
        price = s;
    }
    public void display(){
        System.out.println("Name of the car is " + name);
        System.out.println("Color of the car is " + color);
        System.out.println("Gears in the car is " + gears);
        System.out.println("Price of the car is " + price);
    }
}
public class oop_02 {
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
        car c1 = new car();
        c1.setdata(p,q,r,s);
        c1.display();
    }
}
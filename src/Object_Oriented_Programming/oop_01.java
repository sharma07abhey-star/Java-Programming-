package Object_Oriented_Programming;
// ques - represent a book using class with properties name and price
// set name of the books as mathematics and price as 150
// write a program to bring the details of the book using oop

class book{
    String name;
    int price;
}

public class oop_01 {
    public static void main(String[] args){
        book b = new book();
        b.name = "Mathematics";
        b.price = 150;

        System.out.println("Name of the book is " +b.name);
        System.out.println("Price of the book is " +b.price);
    }
}
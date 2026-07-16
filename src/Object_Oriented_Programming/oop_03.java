package Object_Oriented_Programming;
// copy constructor
import java.util.*;
class Student{
    String name;
    int age;
    Student(String name , int age){        // Parameterized Constructor
        this.name = name;
        this.age = age;
    }
    Student(Student s1){                   // Copy Constructor
        this.name = s1.name;
        this.age = s1.age;
    }
    void printdata(){
        System.out.println("Name :" + name + " & Age " + age);
    }
}
public class oop_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        Student s1 = new Student(name,age);
        Student s2 = new Student(s1);
        s1.printdata();
        s2.printdata();
    }
}

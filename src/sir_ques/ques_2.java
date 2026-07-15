package sir_ques;
// There are two friends atapy and vatapy , atapy wants to calculate the area of the rectangle as he have
// length and breadth of the rectangle and vatapy wants to calculate the area of the circle
// as he has radius of it . Write a program to find out the area for the using function overloading
// Note : Both the areas must be in integers .
import java.util.*;
public class ques_2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("To Calculate Radius");
        int n = inp.nextInt();
        area(n);
        System.out.println("To Calculate area");
        int n1 = inp.nextInt();
        int n2 = inp.nextInt();
        area(n1,n2);
    }
    public static void area(int n){
        System.out.println((int)(3.14 * n * n ));
    }
    public static void area(int n1 , int n2){
        System.out.println(n1 * n2);
    }
}
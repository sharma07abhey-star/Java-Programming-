package Basic_cheeze;

import java.util.Scanner;

public class Input_user {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double r = sc.nextInt();
        double pie = 3.141592;
        System.out.println("Area is :");
        System.out.println(pie * r * r);
    }
}

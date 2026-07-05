package If_Else;

import java.util.Scanner;

// Ternary Operator
public class Ifelse_06 {
    static void main(String[] args) {
        Scanner ter = new Scanner(System.in);
        int a = ter.nextInt();
        System.out.println((a%2==0) ? "Even" : "Odd" );
    }
}

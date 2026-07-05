package If_Else;

import java.util.Scanner ;
public class Ifelse_02 {
    public static void main(String[] args) {
        Scanner divide = new Scanner(System.in);
        int a = divide.nextInt();
        if (a % 5 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not divisible");
        }
    }
}

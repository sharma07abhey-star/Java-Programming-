package If_Else;

// Nested If else
import java.util.Scanner ;
public class Ifelse_05 {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        int a = cal.nextInt();
        int b = cal.nextInt();
        int c = cal.nextInt();
        if (a >= b) {
            if (a >= c) {
                System.out.println("a is greatest");
            } else {
                System.out.println("c is greatest");
            }
        } else {
            if (b >= c) {
                System.out.println("b is greatest");
            } else {
                System.out.println("c is greatest");
            }
        }
    }
}

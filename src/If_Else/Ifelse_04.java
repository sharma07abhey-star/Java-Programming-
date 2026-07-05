package If_Else;

// A number is divisible by 3
// A number is divisible by 5
// A number is divisible by 5 and 3 both
import java.util.Scanner;
public class Ifelse_04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if(a % 5 == 0 && a % 3 == 0){
            System.out.println("Divisible by 3 and 5 both");
        } else if (a%5 == 0) {
            System.out.println("Divisible by 5");
        } else if (a%3 == 0) {
            System.out.println("Divisible by 3");
        }
        else System.out.println("Not divisible by 3 and 5 both ");
    }
}

// Only the first true condition in this code will execute in if else ladder , so we have to
// set priorities according to us

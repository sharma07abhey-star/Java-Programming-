package Methods;
// Build In Math Methods
import java.util.Scanner;
public class method_1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double x = Math.sqrt(4);  // To Find square root
        System.out.println(x);
        System.out.println(Math.abs(-11)); // Returns the absolute (positive) value of a number.
        System.out.println(Math.ceil(4.7)); // Rounds a number up to the nearest integer.
        System.out.println(Math.floor(4.7)); // Rounds a number down to the nearest integer.
        System.out.println(Math.round(4.3)); // Rounds to the nearest whole number.
        System.out.println(Math.max(12,15)); // Returns the larger of two values.
        System.out.println(Math.min(12,15)); // Returns the smaller of two values.
        System.out.println(Math.pow(2,4)); // Calculates a^b (a raised to the power of b).
        System.out.println(Math.cbrt(125)); // Returns the cube root of a number.
    }
}
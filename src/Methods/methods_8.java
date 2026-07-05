package Methods;

public class methods_8 {
    /* Pass-by-Value
     * In Java, all primitive types (int, double, char, etc.) are passed by value.
     * This means when you call swap(a, b), Java creates a COPY of the values
     * inside 'a' and 'b' and gives those copies to the method.
     * * Because the method is working with copies, any changes made to them
     * (like swapping) do not affect the original variables in the 'main' method.
     * The original variables remain in their original memory location
     * untouched by the method */
    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        // These prints will show the swapped values because we are
        // printing the local copies.
        System.out.println("Inside method: " + a + " " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
        // These prints will still show 5 and 10 because the original
        // variables were never modified by the swap method.
        System.out.println("Outside method: " + a + " " + b);
    }
}

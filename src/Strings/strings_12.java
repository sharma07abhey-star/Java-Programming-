package Strings;
// interning new keyword
public class strings_12 {
    public static void main(String[] args){
        // Interning new keyword for creating same strings in different storage blocks
        String s1 =  "Abhey";
        String s2 = new String(" Abhey");
        System.out.println(s1.equals(s2));  // false
    }
}

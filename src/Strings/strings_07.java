package Strings;
// Passing strings to methods
public class strings_07 {
    public static String name(String n){
        System.out.println(n);
        return n;
    }
    public static void main(String[] args){
        String s = "Abhey";  // also strings are immutable 
        name(s);
    }
}

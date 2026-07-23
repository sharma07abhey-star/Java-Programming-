package Strings;
// More inbuild methods on strings
public class strings_05 {
    public static void main(String[] args){
        String s = "This is a string";
        String s3 = "Prashar";
        String s2 = "Abhey";
        System.out.println(s.substring(4,9));  // substring
        System.out.println(s.equals("this"));  // equals
        System.out.println(s.trim());   // deletes extra space
        System.out.println(s.concat(" abhey")); // concat
        System.out.println(s.indexOf("S")); // Find Index
        System.out.println(s.replace("This","That")); // replace
        System.out.println(s.equalsIgnoreCase("This is a String")); //equals ignore case
        System.out.println(s);
        System.out.println(s3.compareTo(s2));  // compares two strings lexographically
        System.out.println(s +" "+ s2 + " "+ s3); // adding two strings directly instead of using concat
        System.out.println('A' + 2 + "Isha");  // aukaat , String > int > char
        // when moving from left to right .
    }
}

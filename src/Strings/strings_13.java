package Strings;
// StringBuilders

// It is a class that represents a mutable sequence of characters - meaning it can be changed in place ,
// without creating a new object every time . It's the go-to tool whenever you need to build or modify a
// string repeatedly ( e.g , inside a loop ) .

public class strings_13 {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("Abhey");
        System.out.println(s.length() + " " + s.capacity());
        s.append(" Prashar");
        System.out.println(s);
        System.out.println(s.length() + " " + s.capacity());
        s.setCharAt(3,'i');
        s.setCharAt(4,'i');
        System.out.println(s);
        s.append(" Sharma");
        String t = s.toString();
        System.out.println(t);
    }
}
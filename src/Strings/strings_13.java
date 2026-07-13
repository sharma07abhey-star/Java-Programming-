package Strings;
// StringBuilders
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
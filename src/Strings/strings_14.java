package Strings;
// Reverse String Builders
public class strings_14 {
    public static void main(String[] args){
        String s = "Ishaa";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        sb.deleteCharAt(4);
        sb.insert(1,'o');
        sb.delete(2,4);
        System.out.println(sb);
//        String name = "abhey";
//        StringBuilder sb = new StringBuilder(name);
//        sb.reverse();
//        name = sb.toString();
//        System.out.println(name);
    }
}

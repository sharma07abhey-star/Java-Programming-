package Strings;
// Converting integer to string
import java.util.*;
public class strings_08 {
    public static void main(String[] args) {
        // There are two methods of converting integer to string
        // 1.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println(s);

        // 2.
        int a = sc.nextInt();
        String b = Integer.toString(a);
        System.out.println(b);
    }
}

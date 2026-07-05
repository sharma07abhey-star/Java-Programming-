package Arrays;
// Array list of other data types ;
import java.util.ArrayList;
public class array_21 {
    public static void main(String[] args){
        ArrayList<Character> arr = new ArrayList<>();
        // the size is 0, even though its internal capacity is 10,
        // but we can increase capacity by entering the number in parentheses .
        arr.add('a');
        arr.add('b');
        arr.add('h');
        arr.add('e');
        arr.add('y');
        System.out.println(arr);

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Abhey");
        arr2.add("Prashar");
        arr2.add("Sharma");
        System.out.println(arr2);
    }
}

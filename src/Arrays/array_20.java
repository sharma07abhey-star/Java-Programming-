package Arrays;

// Array List in Java

import java.util.ArrayList;
import java.util.Collections;
public class array_20 {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>(); // By default, capactity 10

        arr.add(25);
        arr.add(18);
        arr.add(11);
        arr.add(4);
        arr.add(10); // adds element in the last .
        arr.remove(4);  // removes the element ar particular index
        arr.add(1,100); // add element in the particular index
        System.out.println(arr);   // This is the way to print array list
        System.out.println(arr.get(1));  // To access the element you have to use get
        arr.set(0,50);  // To change / update the element in array list
        int n = arr.size();  // arr.length does not work for this
        System.out.println(arr.get(0));

        Collections.reverse(arr);  // To reverse using inbuild method
        System.out.println(arr);
    }
}

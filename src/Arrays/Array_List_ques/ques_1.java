package Arrays.Array_List_ques;

// Create an ArrayList<Integer> and add the numbers 10, 20, 30, 40, 50 to it. Then:
// Print the list
// Remove the element at index 2
// Add 100 at index 1
// Print the final list and its size

import java.util.ArrayList;

public class ques_1 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        arr.remove(2);
        arr.add(1,100);
        System.out.println(arr);
        System.out.println(arr.size());
    }
}

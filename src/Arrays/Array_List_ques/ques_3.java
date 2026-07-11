package Arrays.Array_List_ques;
// reverse array list in place
import java.util.*;
public class ques_3 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
        reverse(arr);
    }
    public static void reverse(ArrayList<Integer> list ){
        int i = 0;
        int j = list.size() - 1;
        while(i<j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        };
        System.out.println(list);
    }
}
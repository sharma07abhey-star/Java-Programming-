package Arrays.Array_List_ques;
// largest in array list
import java.util.ArrayList;
import java.util.Arrays;

public class ques_2 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(findmax(arr));
    }
    public static int findmax(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
}
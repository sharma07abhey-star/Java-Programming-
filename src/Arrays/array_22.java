package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

// Add one into Array list
public class array_22 {
    public static void addone(ArrayList<Integer> list ){
        int n = list.size();
        for(int i = n-1;i>=0;i--){
            int val = list.get(i) + 1;
            if(val < 10){
                list.set(i,val);
                return;
            }else{
                list.set(i,0);
            }
        }
        list.add(0,1);
    }
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number of elements you want to enter :");
        int n = inp.nextInt();
        for(int i = 0;i<n;i++){
            nums.add(inp.nextInt());
        }
        addone(nums);
        System.out.println(nums);
    }
}

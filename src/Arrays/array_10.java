package Arrays;

import java.util.Arrays;

public class array_10 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] deep = Arrays.copyOf(arr,arr.length); // Deep Copy of Arrays
        deep[0] = 100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }
    //  we can create copy of same array and even after making change in that copy the original
    //  Array is not affected .    
}

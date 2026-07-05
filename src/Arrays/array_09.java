package Arrays;
// Shallow Copy And Deep Copy
public class array_09 {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int[] x = arr ;  // x is shallow copy of array arr
        x[0] = 100 ;
        System.out.println(arr[0]);
    }
}

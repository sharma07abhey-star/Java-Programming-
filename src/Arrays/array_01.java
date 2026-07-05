package Arrays;
// Array is a linear data Structure in Java
public class array_01 {
    public static void main(String[] args) {
        int[] x = {4, 5, 10, 11, 15};
        // indexing
        System.out.println(x[0]);
        // updating elements
        x[2] = 4;
        System.out.println(x[2]);

        // another way to initialize array
        int[] arr = new int[7];  // it takes the size of array as parameter .
        // default values in array
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
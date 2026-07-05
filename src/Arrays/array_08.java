package Arrays;
// Passing Arrays into Methods
public class array_08 {
    public static void change(int[] y){
        y[2] = 99;
    }
    public static void main(String[] args){
        int[] x = {1,4,5,3};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
//    whenever we pass an array to methods it is passed by reference .
}

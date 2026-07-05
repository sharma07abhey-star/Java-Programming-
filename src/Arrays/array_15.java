package Arrays;
// Two Variable / Pointer technique to reverse an array
public class array_15 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int f = 0;
        int b = 4;
        while(f<b ){ 
            int temp = arr[f];
            arr[f] = arr[b];
            arr[b] = temp;
            f ++;
            b --;
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}

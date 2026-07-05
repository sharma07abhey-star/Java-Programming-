package Arrays;
// Segregate 0's and 1's
public class array_18 {
    public static void main(String[] args){
        int[] arr = {1,1,1,0};
        int n = arr.length;
        int zerocount = 0;
        for(int ele : arr){
            if(ele == 0) zerocount ++;
        }
        for(int i = 0;i<zerocount;i++){
            arr[i] = 0;
        }
        for(int i = zerocount ;i<n;i++){
            arr[i] = 1;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

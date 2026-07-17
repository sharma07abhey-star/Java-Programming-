package Binary_Search;
// Maximum count of positive integer and negative integer
public class binary_10 {
    public static void main(String[] args){
        int[] arr = {-2,-1,0,1,2,3,4};
        int result = binary(arr);
        System.out.println(result);
    }
    public static int binary(int[] arr){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int negcount = n;
        while(lo<=hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid >= 0) {
                mid = negcount;
                hi = mid - 1;
            }
        }
        return 0;
    }
}
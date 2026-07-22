package Binary_Search;
// Search an element in rotated sorted array .
public class binary_11 {
    public static void main(String[] args){
        
    }
    public static int binary(int[] arr, int target){
        int lo = 0;
        int hi = arr.length -1;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[lo] < arr[mid]){
                if(arr[lo] <= target && target <= arr[mid]){
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            else{
                 if()

            }
        }
        return -1;
    }
}

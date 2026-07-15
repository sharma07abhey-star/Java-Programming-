package Binary_Search;
// Find Peak Index in Mountain Array
public class binary_05 {
    public static void main(String[] args){
        int[] arr = {1,2,6,89,78,65,45,34,2};
        int result = binary(arr);
        System.out.println(result);
    }
    public static int binary(int[] arr){
        int lo = 1;
        int hi = arr.length - 2;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > arr[mid - 1] && arr[mid]>arr[mid + 1]) return mid;
            else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid+1]) lo = mid +1;
            else hi = mid - 1;
        }
        return -1;
    }
}

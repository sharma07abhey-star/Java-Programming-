package Binary_Search;
// Search in descending sorted array
public class binary_04 {
    public static void main(String[] args){
        int[] arr = {100,91,87,76,66,52,43,35,29,13,5};
        int target = 29;
        int result = binary(arr,target);
        System.out.println(result);
    }
    public static int binary(int[] arr, int target){
        int hi = arr.length -1;
        int lo = 0;
        while(lo<=hi){
            int mid = (hi+lo)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) lo = mid + 1;
            else{
                hi = mid -1;
            }
        }
        return -1;
    }
}
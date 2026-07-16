package Binary_Search;
// Find Floor in Sorted Array
public class binary_06 {
    public static void main(String[] args){
        int[] arr = {1,2,4,8,10,10,12,19};
        int target = 5;
        int result = binary(arr,target);
        System.out.println(result);
    }
    public static int binary(int[] arr,int target){
        int lo = 0;
        int hi = arr.length - 1;
        int idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > target) hi = mid -1;
            else{
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
}
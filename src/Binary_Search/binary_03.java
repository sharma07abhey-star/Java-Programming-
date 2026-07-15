package Binary_Search;
// Binary search 3 / at last occurrence
public class binary_03 {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,2,3,3,3,3,5,5,6,6};
        int target = 3;
        int result = binary(arr,target);
        System.out.println("Last occurrence of "+ target + "is at index :" + result);
    }
    public static int binary(int[] arr,int target){
        int lo = 0;
        int hi = arr.length -1;
        int idx = -1;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if(arr[mid] < target) lo = mid + 1;
            else if(arr[mid] > target ) hi = mid - 1;
            else{
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
}

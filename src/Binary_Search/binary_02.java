package Binary_Search;
// Binary search 2 / at first Occurrence
public class binary_02 {
    public static void main(String[] args){
        int[] arr = {1,4,6,9,23,56,89,234,234,234,345,678,2345,7867};
        int target = 234;
        int result = binary(arr,target);
        System.out.println("First occurrence of " + target + " is at index :" + result);
    }
    public static int binary(int[] arr,int target){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                idx = mid;
                hi = mid -1;
            }
            else if(arr[mid] < target) lo = mid + 1;
            else hi = mid -1;
        }
        return idx;
    }
}

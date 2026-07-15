package Binary_Search;
// Binary Search
public class binary_01 {
    public static void main(String[] args){
        int[] arr = {1,2,5,77,99,897,898,899,6789,6879,6978,23456};
        int target = 99;
        int result = binary(arr,target);
        if(result != -1){
            System.out.println("Element found at index "+ result);
        }else{
            System.out.println("Element not found in the array");
        }
    }
    public static int binary(int[] arr , int target){
        int n = arr.length;
        int lo = 0;
        int high = n-1;
        while(lo<=high){
            int mid = (lo + high)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                lo = mid +1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}

package Binary_Search;
// Single Element in a sorted array LC 540
public class binary_08 {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,4,4,6,7,7,8,8,9,9};
        int result = binary(arr);
        System.out.println(result);
    }
    public static int binary(int[] nums){
        int n = nums.length;
        if(n == 1){ return nums[0]; }
        if(nums[0] != nums[1]){ return nums[0]; }
        if(nums[n-1] != nums[n-2]){ return nums[n-1]; }
        int lo = 0;
        int hi = nums.length - 1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid + 1]){ return nums[mid]; }
            int f = mid , s = mid;
            if(nums[mid - 1] == nums[mid]){ f = mid -1; }
            else{ s = mid + 1; }  // nums[mid] == nums[mid + 1]
            int leftdis = f -lo;
            int rightdis = hi - s;
            if(leftdis %2 == 0){ lo = s +1; }
            else hi = f -1;
        }
        return 0;
    }
}

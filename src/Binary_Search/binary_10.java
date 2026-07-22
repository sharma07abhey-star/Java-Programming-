package Binary_Search;
// Maximum count of positive integer and negative integer
public class binary_10 {
    public static void main(String[] args){
        int[] arr = {-2,-1,0,1,2,3,4};
        int result = binary(arr);
        System.out.println(result);
    }
    public static int binary(int[] nums){
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        int negcount = n;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] >=0){
                negcount = mid;
                hi = mid-1;
            }else{
                lo = mid +1;
            }
        }
        lo = 0;
        hi = n-1;
        int posstart = n;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] >=1){
                posstart = mid;
                hi = mid-1;
            }else{
                lo = mid +1;
            }
        }
        int poscount = n - posstart;
        return Math.max(negcount,poscount);
    }
}
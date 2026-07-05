package Time_Space_Complexity;

// Find the duplicate element - Method 2

// Using Boolean array , but
// The boolean array approach is only considered "optimal" when the range is small and dense.
// and to use this we need to know the maximum element in an array and according to that element
// we give space to boolean array
public class duplicate_02 {
    public static void main(String[] args){
        int[] arr = {1,5,4,3,6,4};   // here maximum value is 6
        boolean[] seen = new boolean[6 + 1]; // so we give 7 memory blocks to boolean array
        System.out.println("Duplicate is :");
        for(int ele : arr){
            if(seen[ele] == true){
                System.out.println(ele + " ");
            }
            else seen[ele] = true;
        }
    }
}
// Time Complexity O(n)
// Inefficient for very long maximum element .
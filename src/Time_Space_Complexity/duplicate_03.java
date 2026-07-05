package Time_Space_Complexity;

// Find the duplicate element - Method 3 , Best approach
// only when we know the range of numbers from 1 to n, and we have to find duplicate within
public class duplicate_03 {
    public static void main(String[] args){
        int[] arr = {1,4,3,6,5,2,4};  // numbers -> 1 to 6
        int n = arr.length - 1;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        int expectedSum = (n * (n + 1)) / 2;
        int duplicate = sum - expectedSum;
        System.out.println("The duplicate element is : " + duplicate);
    }
}

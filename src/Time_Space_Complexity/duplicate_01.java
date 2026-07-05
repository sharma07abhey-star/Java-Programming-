package Time_Space_Complexity;

// Time complexity measures how the runtime of an algorithm increases as the input size grows,
// while space complexity measures how much extra memory it requires to execute .

// Find the duplicate element - Method 1
// Using Nested loops
public class duplicate_01 {
    public static void main(String[] args){
        int[] arr = {1,5,4,8,4};
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate is present : ");
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}

// Total Number of operations in this code = 4 + 3 + 2 = 9
// Time complexity O(n^2)
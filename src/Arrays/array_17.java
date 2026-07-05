package Arrays;
// Missing Number in array when numbers are from 1 to n and one element missing
// input 1,2,3,5,6 -> output 4
public class array_17 {
    public static void main(String[] args){
        int[] arr = {1,2,3,6,9,8,5,4};
        long sum = 0;
        for(int i = 0;i<= arr.length + 1;i++){
            sum += i;
        }
        for(int i = 0;i<arr.length;i++){
            sum -= arr[i];
        }
        System.out.println((int)(sum));
    }
}

// Here we took long variable instead of int because int cannot go beyond its range
// and int gets overloaded when there are many values .
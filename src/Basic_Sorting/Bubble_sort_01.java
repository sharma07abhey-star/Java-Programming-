package Basic_Sorting;

// Array Sorting using Bubble sort Algorithm

public class Bubble_sort_01 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {5,7,-4,6,8,3,1};
        int n = arr.length;
        print(arr);
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}
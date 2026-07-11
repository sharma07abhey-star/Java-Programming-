package Basic_Sorting;
// Sort an array in descending order using bubble sort
public class Bubble_sort_02 {
    public static void main(String[] args){
        int[] arr = {4,23,6,2,9,8,-5};
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

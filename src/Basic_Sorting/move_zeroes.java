package Basic_Sorting;
// Move all zeroes to the end
public class move_zeroes {
//    public static void main(String[] args) {
//        int[] arr = {1, 0, 5, 0, 3, 5, 0, 4, 2};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] == 0) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//    }

    // another method to do this question with better time complexity
    public static void main(String[] args){
        int[] arr = {1,0,4,0,3,5,3,2,0,4};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]!=0){
                i++;
            }
            else if(arr[i] == 0){
                arr[i] = arr[j];
                arr[j] = 0;
                i ++ ;
                j --;
            }
        }
        for(int k = 0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
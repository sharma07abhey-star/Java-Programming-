package Strings.Ques_Strings;
// Reverse a String Without using built in methods
public class ques_01 {
    public static void main(String[] args) {

//        String s = "Abhey Prashar";
//        char[] arr = s.toCharArray();
//        int i = 0;
//        int j = arr.length - 1;
//        while (i < j) {
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        String reversed = new String(arr);
//        System.out.println(reversed);


// Method 2 with built-in sort

        String s = "Abhey Prashar";
        StringBuilder sb = new StringBuilder();
//        String reversed = sb.reverse().toString();
        for (int i = s.length() -1;i>=0;i--){
            sb.append(s.charAt(i));
      }
        String reverse = sb.toString();
        System.out.println(reverse);
    }
}
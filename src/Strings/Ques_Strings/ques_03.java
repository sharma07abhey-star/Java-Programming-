package Strings.Ques_Strings;
// Reverse all words in a given Sentence
public class ques_03 {
    public static void main(String[] args){
        String s = "Abhey Prashar";
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            char[] arr = word.toCharArray();
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            sb.append(new String(arr));
            sb.append(" ");
        }
        String Result = sb.toString().trim();
        System.out.println(Result);
    }
}

package Basic_cheeze;

public class CharDataType {
    public static void main(String[] args) {
        char abhey = 'a';
        System.out.println(abhey);
        // typecasting -> conversion from one data type to another
        char x = 'A';
        int b = x;  // implicit typecasting
        System.out.println(b);
        char sharma = 'p';
        int y = (int)sharma ; // explicit typecasting
        System.out.println(y);

        // character to integer
        char u = '3';
        int t = (int)u;
        System.out.println(t);  // 51 because '0' starts from 48 and ends at '9' which is 57 .

        // integer to character
        int o = 97;
        char q = (char) o;
        System.out.println(q);
    }
}

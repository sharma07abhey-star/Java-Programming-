package Strings;
public class str_file_0 {
}
// Why String are immutable in Java ?

// Once a string object is created , its content can neer be changed
// Every operation that looks like it modifies a string actually create a new object in memory


// Why does Java Design strings this way ?
//  Immutability provides -
    // 1. Security -> Strings are widely used for things like file paths , network connections , class names
    //    if they could be silently changed by any code that has a reference to them , it would be a security risk
    // 2. Thread Safety -> Multiple parts of a program can safely share the same string without
    //    worrying about one part changing it
    // 3. The string pool Optimisation - Since strings cant change , java can safely let multiple variables
    //    share the exact same string object in memory , saving memory .

// The problem : Why Immutability hurts performance in loops
// consider building a long string inside a loop

// String result = " ";
// for(int i = 1;i<=5;i++){
//     result = result + i;
// }
// Sout(result);
import java.util.Scanner;
import java.lang.StringBuilder;
public class StringProblem {
    public static String reverseString(String s){
//        String ss ="";
//        for (int i=s.length()-1; i >= 0; i--){
//            ss+=s.charAt(i);
//        }
        StringBuilder change = new StringBuilder(s);

        return change.reverse().toString();
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String s = input.nextLine();

       System.out.println(reverseString(s));
    }
}

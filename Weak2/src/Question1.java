import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       System.out.printf("%d\n", Question2.sum(a,b));
       input.close();
       System.out.println(StringProblem.reverseString("Xin Chao"));
    }
}

import java.util.Scanner;
public class recursionProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(countDigits(n));

    }
    public static int countDigits(int n){
        if (n/10==0) return 1;
        else {
            return 1+countDigits(n/10);
        }
    }
}


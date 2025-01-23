import java.util.Scanner;

public class Main {

    public static boolean primeNum(int a){
        boolean check = true;
        for (int j=2; j< a; j++) {
            if (a%j==0){
                check = false;
                break;
            }

        }
        if  (a==1) check = false;
        return check;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if  (primeNum(arr[i])) {
                System.out.printf("%.2f ",(double) arr[i]);
            }
        }

    }
}

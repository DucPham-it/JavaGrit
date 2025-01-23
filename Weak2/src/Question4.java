import java.util.Scanner;
public class Question4 {

    public static String reverse(String s)
    {
        String newStr="";
        for(int i=0; i< s.length(); i++)
        {
            newStr= s.charAt(i) + newStr;
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        String str= cin.nextLine();
        System.out.println(reverse(str));
    }


}

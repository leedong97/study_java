package casting_ex;

import java.util.Scanner;

public class Ex1_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자 :");
        String s = sc.next();
        char c = s.charAt(0);
        // char s = sc.next().charAt(0);
        int a = (int)c;


        System.out.println(s+" unicode :"+a);
    }
}

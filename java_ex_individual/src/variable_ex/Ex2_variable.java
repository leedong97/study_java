package variable_ex;

import java.util.Scanner;

public class Ex2_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수: ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수: ");
        int b=  sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        
        
    }
}

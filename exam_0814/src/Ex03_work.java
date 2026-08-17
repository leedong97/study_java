import java.util.Scanner;

public class Ex03_work {
   public static void main(String[] args) {
    
    /*
    수 1: 10
    수 2: 20
    연산자 :+
    10 + 20 = 30
    */
    Scanner sc = new Scanner(System.in);
    System.out.print("수1: ");
    int a= sc.nextInt();
    System.out.print("수2: ");
    int b= sc.nextInt();
    System.out.print("연산자: ");
    String op =sc.next();    
    // 내 오답 -System.out.println(a+op+b+"="+(a+op+b));
    switch(op){
        case "+":
            System.out.printf("%d + %d= %d\n",a,b,a+b);
            break;
        case "-":
            System.out.printf("%d - %d= %d\n",a,b,a-b);
            break;
        case "*":
            System.out.printf("%d * %d= %d\n",a,b,a*b);
            break;
        case "/":
            System.out.printf("%d / %d= %f\n",a,b,(float)a/b);
            break;
        default:
            System.out.println("연산자 오류");
            break;
    }









   }//main
}

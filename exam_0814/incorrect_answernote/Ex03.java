import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        /*
         * 수 1: 10
         * 수 2: 20
         * 연산자 :+
         * 10 + 20 = 30
         */
        /*
         내 첫번째 고비
         - c가 string이라 case문에서 어떻게 수의 합을 받아야할지 형변환쪽에서
            고민
            - 
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("수1: ");
        int a = sc.nextInt();
        System.out.print("수2 : ");
        int b= sc.nextInt();
        System.out.print("연산자 :");
        String c = sc.next();
        switch(c){
            case "+":
                System.out.printf(" %d + %d = %d",a,b,a+b);
            break;
            case "-":
                System.out.printf("%d - %d = %d",a,b,a-b);
            break;

            case "*":
                System.out.printf("%d * %d = %d",a,b,a*b);
            break;

            case "/":
                System.out.printf("%d / %d = %d",a,b,a/b);
            break;

            default:
            System.out.println("연산자를 제대로 입력하세요");
            break;
                
               





        }














    }//main
}

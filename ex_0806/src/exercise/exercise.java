package exercise;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
         수1: 10
         수2: 20
         연산자: +
        10+20 = 30
        */

        System.out.print("수1:");
        int n1= sc.nextInt();
        System.out.print("수2:");
        int n2= sc.nextInt();
        System.out.print("연산자: ");
        String op =sc.next();
       
        int n3= 0;
        float n4= 0;

        switch(op){
            case "+":
             n3= n1+n2;
            break;

            case "-":
              n3 = n1-n2;
            break;

            case "*":
                n3= n1*n2;


            break;

            case "/":
                n4 = (float)n1/n2;
            break;

            default:
                System.out.println("연산자를 올바르게 입력해주세요.");
            break;
        }
        if (op.equals("/")){
            System.out.println(n1+op+n2+"="+n4);
        }else{
            System.out.println(n1+op+n2+"="+n3);
        }

    }
}

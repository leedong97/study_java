package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        /*
         수1: 10
         수2: 20
         연산자: +
        10+20 = 30
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("수1: ");
        int n1= sc.nextInt();
        System.out.print("수2: ");
        int n2= sc.nextInt();
        int n3= 0;
        float n4 = 0;
        System.out.print("연산자:");    
        String op =sc.next();

        switch (op) {
            case "+":
                n3= n1+n2;
                break;
        
           case  "-":
                n3= n1-n2;
                break;
            case "*":
                n3= n1*n2;
                break;
            case "%":
                n3= n1%n2;
                break;
            case "/":
                n4= (float)n1/n2;
                break;
            default:
            System.out.println("연산자 오류입니다.");
             break;
        }

        if( op.equals("/") ){
            System.out.println(n1+op+n2+"="+n4);
        }else{
            System.out.println(n1+op+n2+"="+n3);

        }


           
        // System.out.println("수1: ");
        // int su1 = sc.nextInt();

        // System.out.println("수2: ");
        // int su2= sc.nextInt();

        // System.out.println("연산자 : ");
        // String op = sc.next();






    }
    
}

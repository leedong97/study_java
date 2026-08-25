package ex10_work;

import java.util.Scanner;

public class Ex4_work {

    public static void main(String[] args) {

        // 입력 : 1771
        // 1771은(는) 4자리의 홀수입니다

        // 입력 : 30
        // 30은(는) 2자리의 짝수입니다

        // 입력 : 100a
        // 100a은(는) 정수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        //--
        String sNum = sc.next();   

        try{
            int n =Integer.parseInt(sNum);// 문자열을 정수로 만들어주는 방법

            System.out.printf("%d는 %d자리의",n,sNum.trim().length());

            if(n %2 ==0){
                System.out.println("짝수입니다");
            }else{
                System.out.println("홀수 입니다");
            }


        }catch(Exception e){
            System.out.println(sNum+"은(는) 정수가 아닙니다");
        }


        // int a = sc.nextInt();
        // int length = String.valueOf(a).length();
        // String s ="";
        // if(a/2 ==0){
        //     s= "홀수";
        // }else{
        //     s= "짝수";
        // }
       

    }// main
}

package ex6_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        // 입력받은 두 수의 최소공배수
        // --------------------
        // 수1 : 6
        // 수2 : 10
        // 최소공배수 : 30

        Scanner sc = new Scanner(System.in);
        System.out.print("수1: ");
        int a = sc.nextInt();

        System.out.print("수2: ");
        int b = sc.nextInt();
        int minx = 0;

        out :for(int i=a;i <=a*b;i++){
            for(int j=b;j<=a*b; j++){
                if(i%a ==0&& j%b ==0 && i==j){
                    minx = j;
                    break out;
                }
                
            }
        
        }
        System.out.println("최소공배수: "+minx);
        //- 밑에식은 for문의 조건식에 문제가 있는데 조건식이라는것 자체가
        // 저 조건이 만족할때까지 실행이라 멈춰버린다.
        // for(int i =0; i%a==0 && i%b==0 && a==b;i++){
        //    minx =a;

        // }
        // System.out.println(minx);

        // // minx= 최소공배수
        // out: for (int i = a; i >= a; i++) {
        //     for (int j = b; j >= b; j++) {
        //         if (i % a == 0 && j % b == 0 && i == j) {
        //             minx = j;
        //             break out;
        //         }
        //     }
        // }
        // System.out.println("최소공배수: " + minx);

    }// main
}

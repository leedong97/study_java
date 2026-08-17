package ex2_while;

import java.util.Scanner;

public class Ex2_while {
    public static void main(String[] args) {
        // 키보드에서 3을 입력받을 때 까지 영원히 반복하는 while문을 만들어보자
        // ------------------
        // 입력 : 1
        // 값 : 1
        // 입력 :2
        // 값: 2
        // 입력 : 3
        // 값 :3
        // 종료됨
        Scanner sc = new Scanner(System.in);

        int num = 0;

        while (num != 3) {
            System.out.print("입력: ");
            num = sc.nextInt();
            System.out.println("값:" + num);

        } // while
        System.out.println("종료됨");
        // 종료됨을 원하면 while이 true일때는 계속돌고있으니까 while 뒤에 종료 코드를 쓴다.

        
        // int a =0;
        // while(a==3){
        // System.out.print("입력: ");
        // a = sc.nextInt();
        // System.out.println("값: "+a);
        // System.out.print("종료됨");
        // }

    }// main

}

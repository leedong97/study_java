package ex3_scanner;

import java.util.Scanner;

public class Ex1_scanner {
    public static void main(String[] args) {
        
        /*
        키보드에서 값을 받기위한 Scanner객체
        */
       Scanner sc = new Scanner(System.in);
       //scanner에 마지막에 포인트를 찍고 컨트롤 스페이스 누르면 임포트가 나온다 그걸쓰면 된다.

       System.out.print("정수: ");
       int n= sc.nextInt();
       //sc.nextInt가 다음에 입력받는값을 n으로 삽입한다는 말이다.
       System.out.println("값:"+n);
       
        System.out.println("문자열: ");
        String s = sc.next();
        System.out.println("값 :"+s);
    }//main
}
























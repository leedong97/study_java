package ex2_while;

import java.util.Random;
import java.util.Scanner;

public class Ex3_while {
    public static void main(String[] args) {

        // 1~ 100사이의 난수를 만들고
        // 키보드에서 입력받은 값이 정답일 때 게임을 종료
        // ---------------------------------
        // 숫자 : 25
        // up
        // 숫자 : 70
        // Down
        // 숫자: 50
        // 정답입니다

        Scanner sc = new Scanner(System.in);
        int a = new Random().nextInt(100) + 1;
        System.out.println(a);
        int b = 0;

        while (a != b) {
            System.out.print("숫자: ");
            b = sc.nextInt();
            if (a > b) {
                System.out.println("up");
            } else if (a < b) {
                System.out.println("Down");
            } else{
                System.out.println("정답입니다");
            }

        }
   

    }// main
}

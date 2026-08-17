package ex2_while;

import java.util.Random;
import java.util.Scanner;

public class Ex5_do_while {

    public static void main(String[] args) {

        // 자바, jsp, 안드로이드의 시험을 봤다.
        // 각 과목별점수는 랜덤하게 0~130점이 대입
        // 각 과목별 점수를 검사하여
        // 100점을 넘어가는 점수가 하나도 없을때
        // 최종 결과를 화면에 출력
        // --------------------------------------
        // 자바 : 37
        // jsp : 100
        // 안드로이드 : 13

        int a ;
        int b ;
        int c ;

        do {
            a = new Random().nextInt(131);
            b = new Random().nextInt(131);
            c = new Random().nextInt(131);
            
        } while (a > 100 || b > 100 || c > 100);

        System.out.println("자바:" + a);
        System.out.println("자바: " + b);
        System.out.println("자바: " + c);

    }

}

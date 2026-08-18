package homework;

import java.util.Random;
import java.util.Scanner;

public class Ex1_homework {
    /*
     * 세자리 수를 입력하세요(예:123) - 123
     * 1Strike, 1Ball
     * --------------------------
     * 세자리 수를 입력하세요(예:123) - 567
     * OUT!!
     * --------------------------
     * 세자리 수를 입력하세요(예:123) - 214
     * 0Strike, 3Ball
     * --------------------------
     * 세자리 수를 입력하세요(예:123) - 142
     * 4회 정답 !! - 142
     */
    // do while 한번 써볼까?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = new Random().nextInt(900) + 100;
        System.out.println(a);
        System.out.print("세자리 수를 입력하세요(예:123)- ");
        int b = sc.nextInt();

        String c = String.valueOf(a);
        String d = String.valueOf(b);
        int strike = 0;
        int ball = 0;
        int out = 0;
        int count = 0;

        while (a != b) {
            for (int i = 0; i < 3; i++) {
                char res1 = c.charAt(i);
                for (int j = 0; j < 3; j++) {
                    char res2 = d.charAt(j);
                    if (res1 == res2 && i == j) {
                        strike++;
                    } else if (res1 == res2 && i != j) {
                        ball++;
                    } else if (res1 != res2) {
                        out++;
                    }
                } // for inner

            } // for outer
            count++;
            if (a != b) {
                if (strike > 0 || ball > 0) {
                    System.out.println(strike + "Strike, " + ball + "ball");
                } else if (out == 9) {
                    System.out.println("OUT!!");
                }
            } else if( a==b) {
                System.out.println(count + "회 정답!! -" + b);
            }

        } // while

    }

}

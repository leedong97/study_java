import java.util.Random;
import java.util.Scanner;

public class Ex08_work {
    public static void main(String[] args) {

        // 1 ~ 45사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        // -------------------
        // 17 2 45 27 9 11
        int[] lotto = new int[6];

        // outer: for (int i = 0; i < lotto.length;) {
        // lotto[i] = new Random().nextInt(6) + 1;
        // // 중복값 비교
        // for (int j = 0; j < i; j++) {

        // if (lotto[i] == lotto[j]) {
        // continue outer;
        // }

        // } // inner
        // System.out.print(lotto[i] + " ");
        // i++;

        // } // outer

        

        Random r = new Random();
        out: for (int i = 0; i < 6;) {
            int a = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    continue out;
                }
            }
            lotto[i] = a;
            i++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }

    }
}

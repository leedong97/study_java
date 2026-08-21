package ex9_work;

import java.util.Random;

public class WorkSub {

    Random rnd = new Random();

    public void lottoRnd(int[] lotto) {
        

        outer: for (int i = 0; i < lotto.length;) {
            lotto[i] = rnd.nextInt(45) + 1;
            for (int j = 1; j < i; j++) {
                //length면 i=1, j=1 인경우 무한루프가 돌수밖에없다
                // 시 발 개 멍청한 새끼아러ㅣㅁㅇ러ㅏㅣㅇㅁ너ㅏㄹ
                
                if (lotto[i] == lotto[j]) {
                    continue outer;
                }
                //System.out.println("--");
            } // inner

            // System.out.print(lotto[i]);
            i++;
            //System.out.println("++");
        } // outer

    }
}

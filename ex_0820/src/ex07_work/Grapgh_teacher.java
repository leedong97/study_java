package ex07_work;

import java.util.Random;

public class Grapgh_teacher {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random rnd = new Random();

        // 위의 for문의 이 문제의 핵심이다.
        // 난수의 값이 동일한경우 즉 난수가7인경우가 3번반복되면
        // arr[i]에서 카운팅개념처럼 오르기때문에 한번에 갯수까지 샐수있다.
        for (int i = 0; i < 100; i++) {
            int r = rnd.nextInt(10);
            arr[r]++;
        }//for
        
        GraphSub_teacher gt = new GraphSub_teacher();
        gt.print(arr);

    }

}

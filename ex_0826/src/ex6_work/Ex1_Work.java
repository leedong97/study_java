package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1_Work {

    public static void main(String[] args) {

        // ArrayList arr 에 1~30 사이의 난수를 5개 추가
        // arr에 담겨진 값 중 가장 큰 값 출력
        // ----------------------------
        // [16,13,29,29,14]
        // 가장 큰 값 : 29

        Random rnd = new Random();
        int max = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(30) + 1;
            list.add(num);
        }
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            max = list.get(0);
            if (list.get(0) < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("가장 큰 값: " + max);
    }
}

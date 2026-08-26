package ex8_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkMain {

    public static void main(String[] args) {
        // 3초마다 새로운 배열에 data의 값중에 1개를 랜덤으로 추가된다.
        // (별개로 계속 도는중)
        // 생성된 값을 타이핑하면 맞게 치면 1개씩 줄어든다
        // 배열의 값이 없으면 clear 라고 뜬다.
        /*
         * [strawberry]
         * >> strawberry
         * [orange, grape, apple]
         * >> orange
         * [grape, apple]
         * >> grape
         * [apple, apple]
         * >> apple
         * [apple]
         * >> apple
         * [strawberry]
         * >> strawberry
         * 클리어!!!
         */

        String[] data = { "apple", "banna", "orange", "grape", "straberry", "pineapple" };
        // thread를 사용하는데 runnnable이 실무에서 더 많이쓰인다고해서
        // runnable을 이용할건데 runnable은 클래스가아니라 인터페이스라
        // 구현의 기능을 갖고있는데 start로 쓰레드를 실행시키는것은 가지고
        // 있지 않아서 한번더 thread객체를 생성시켜 그 기능을 활성화 시켜줘야한다.
        List<String> list = new ArrayList<String>();
        boolean isCheck = true;
        WorkThread wt = new WorkThread(data, isCheck, list);
        // 내 코드상 data(String[]), isCheck(boolean), list(ArrayList)값을 파라미터로 넘겨줘야한다
        Thread th = new Thread(wt);

        th.start();

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (isCheck == false) {
                wt.setCheck(false);
                System.out.println("CLEAR!!");
                break;
            } else {

                String typing = sc.next();
                for (int i = 0; i < list.size(); i++) {
                    if (typing.equals(list.get(i))) {
                        list.remove(list.get(i));
                    }
                }
                if (list.size() == 0) {
                    isCheck = false;
                }
            }

        }

    }// main
}

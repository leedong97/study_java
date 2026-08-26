package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_Work {
    public static void main(String[] args) {

        // 정수입력( 입력종료 : 0 )
        // >> 45
        // >> 17
        // >> 20
        // >> 21
        // >> 0 (0은 저장 x)
        // --------------------------
        // 숫자 범위를 입력하세요
        // 시작수: 15
        // 끝 수 : 20
        // 17
        // 20
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("정수입력 (입력종료: 0)");
        System.out.print(">>");
        int num = sc.nextInt();
        while (num != 0) {
            list.add(num);
            System.out.print(">>");
            num = sc.nextInt();
        }
        System.out.println(list);

        System.out.println("--------");
        System.out.println("시작수");
        int start = sc.nextInt();
        System.out.println("끝 수");
        int end = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) >= start && list.get(i) <= end) {
                System.out.println(">>" + list.get(i));
            }

        }

    }// main
}

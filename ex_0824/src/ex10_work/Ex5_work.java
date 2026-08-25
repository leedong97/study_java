package ex10_work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        // 나누기 연산만을 하는 계산식을 만들어 결과를 완성하기
        // (연산결과를 담눈 변수는 float이 아닌 int라 하자)
        // ----------------------------------------
        // 수1 : 10
        // 수2 : 2
        // 결과 : 10/2 == 5

        // 수1 : 10
        // 수2 : 0
        // 오류 : 0으로 나눌 수 없습니다

        // 수1 : abc
        // 오류 : 숫자가 아닙니다

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("수1 :");
            int su1 = sc.nextInt();
            System.out.print("수2 :");
            int su2 = sc.nextInt();
            System.out.printf("결과 : %d/%d ==%d", su1, su2, su1 / su2);
        } catch (ArithmeticException a) {
            a.printStackTrace();
            StackTraceElement[] arr = a.getStackTrace();
            System.out.println("0으로 나눌수 없습니다");
            System.out.println(arr[0]);

        } catch (InputMismatchException e) {
            e.printStackTrace();
            StackTraceElement[] arr = e.getStackTrace();
            System.out.println("숫자가 아닙니다.");
            System.out.println(arr[0]);
        }

    }// main
}

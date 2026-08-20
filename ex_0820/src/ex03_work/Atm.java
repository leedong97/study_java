package ex03_work;

import java.util.Scanner;

public class Atm {

    Scanner sc = new Scanner(System.in);

    // 입금
    public boolean menu1(int num, int num1, int num2) {
        System.out.println("---입금---");
        System.out.println("입금액: ");
        num1 = sc.nextInt();
        System.out.println("입금성공");
        System.out.println("----------");
        return false;
    }

    // 출금
    public boolean menu2(int num, int num1, int num2) {
        System.out.println("---출  금-----");
        System.out.println("출금액: ");
        num2 = sc.nextInt();
        if (num1 < num2) {
            System.out.println("잔액을 확인해주세요~!");
        } else {
            System.out.println("출금성공");
            System.out.println("----------");
        }

        return false;

    }

    // 잔액확인
    public boolean menu3(int num, int num1, int num2) {
        System.out.println("----잔액 확인 -----");
        System.out.println(num1 - num2 + "원");
        System.out.println("----------");
        return false;
    }

    // 종료
    public boolean menu4(int num, int num1, int num2) {
        System.out.println("atm 사용을 종료합니다.");
        return true;
    }

}

package ex03_work;

import java.util.Scanner;

public class Account {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. 입 금");
        System.out.println("2. 출 금");
        System.out.println("3. 잔액확인");
        System.out.println("ect. 종료 ");
        System.out.print(">>");
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 0;
        Atm at = new Atm();
        boolean res = false;

        while (res != true) {
            
            if (num == 1) {
                at.menu1(num, num1, num2);
            } else if (num == 2) {
                at.menu2(num, num1, num2);
            } else if (num == 3) {
                at.menu3(num, num1, num2);
            } else {
                at.menu4(num, num1, num2);
                break;
            }
        }

    }// main
}

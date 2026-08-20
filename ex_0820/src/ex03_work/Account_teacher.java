package ex03_work;

import java.util.Scanner;

public class Account_teacher {
/*
        1.입    금
        2.출    금
        3.잔액확인
        ect.종  료
        >> 1
        ---입  금---
        입금액 : 1000
        입금성공
        ------------
        1.입    금
        2.출    금
        3.잔액확인
        ect.종  료
        >> 3
        ---잔액확인---
        1000원
        -------------
        1.입    금
        2.출    금
        3.잔액확인
        ect.종  료
        >> 4
        atm 사용을 종료합니다
        */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Atm_teacher atm = new Atm_teacher();
         while (true) {

            System.out.println("1. 입 금");
            System.out.println("2. 출 금");
            System.out.println("3. 잔액확인");
            System.out.println("ect. 종료 ");
            System.out.print(">>");

            int select = sc.nextInt();
            int money= 0;
            

            switch(select){

                case 1:
                    System.out.println("---입금---");
                    System.out.println("입금액: ");
                    money = sc.nextInt();
                    atm.deposit(money);
                    System.out.println("입금성공");
                    System.out.println("----------");
                break;

                case 2:
                    System.out.println("---출금---");
                    money= sc.nextInt();
                    atm.withdraw(money);
                break;

                case 3:
                    System.out.println("---잔액확인---");
                    atm.balance();
                break;

                default:
                    System.out.println("atm사용을 종료합니다");
                return;
                //void 반환형태에서는 return;이걸로
                // 이 프로그램의 종료에요 라는 뜻으로 사용이 가능하다.


            }//switch

            System.out.println("--------------------");
        }
    }
}

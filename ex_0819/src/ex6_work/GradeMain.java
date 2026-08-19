package ex6_work;

import java.util.Scanner;

public class GradeMain {
    

    public static void main(String[] args) {
        
        //--등급 기준 --
        // VIP -> 구매금액의 10%
        // GOLD -> 구매금액의 5%
        // SILVER -> 구매금액의 3%      

        // 키보드에서 구매금액과 등급을 입력받아- main
        // 적립포인트 계산 - sub
        //----------------------------------
        // 구매금액 : 10000(입력받기)
        // 등급 : VIP(입력받기)
        // 적립포인트 : 1000

        // 구매금액 : 1000
        // 등급 : aaa
        // 회원등급이 올바르지 않습니다
        // 적립포인트 : 0

        Scanner sc= new Scanner(System.in);
        System.out.print("구매금액: ");
        int price = sc.nextInt();
        System.out.print("등급: ");
        String grade= sc.next();
        System.out.print("적립 포인트: ");

       
        Gradesub sub = new Gradesub();
        int res= sub.result(price, grade);

        System.out.println(res);
       
        



    }
}

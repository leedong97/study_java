package ex_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        /*                          1번 문제
        윤년 구하기(for문을 쓸 필요는 없을거같다라고 말해주심)
        키보드에서 년도를 입력받는다
        입력받은 년도가 윤년인지 평년인지를 판단
        ----윤년----
        4로 나눠 떨어지지만 100으로는 나누어 떨어지지 않는 연도
        연도가 100으로 나누어 떨어지는 해는 평년
         -> 4년 주기에 포함이 되어 있더라도 100으로 나눠지면 평년
         단, 100으로 나눠지더라도 400으로 나눠지면 윤년 

        -----------------------------
   
       
        */
  
       Scanner sc= new Scanner(System.in);
       System.out.print("년도 : ");
       int year = sc.nextInt();

       if(year%4==0 && year%100!=0 || year%400 ==0){
        System.out.print(year+"년은 윤년입니다.");

       }else{
        System.out.println(year+"년은 평년입니다.");
       }
    }
}

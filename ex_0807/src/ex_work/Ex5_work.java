package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        //정수 n1, n2를 입력받고
        // n1~ n2 사이의합을 출력
        // ------------------
        // 수1 : 2
        // 수2 : 5
        // 결과 : 14

        // 수1 : 5
        // 수2 : 2
        // 결과 : 14
        Scanner sc= new Scanner(System.in);
        
        System.out.print("수1: ");
        int n1 = sc.nextInt();

        System.out.print("수2: ");
        int n2 = sc.nextInt();

    
        int res = 0;// 결과 출력용 변수

        // n1과 n2의 값을 교환
        // - 밑에처럼 else if를 한번더 쓸게 아니라 스위칭이라는 개념으로 쓰자
        // if( n1> n2){
        //     int n3 = n1;
        //     n1=n2;
        //     n2= n3;
        // }
        for(int i=n1 ;i<=n2; i++){
            res+=i;
        }
        
        if(n1< n2){
            for(int i=n1 ;i<=n2; i++){
                res+=i;
            }
        }else if (n1> n2){
            for(int i=n2;n1>=i; i++){
                res +=n2+i;
            }
            

        }
        System.out.println("결과: "+res);


    }//main
}

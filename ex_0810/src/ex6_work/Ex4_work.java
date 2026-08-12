package ex6_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 두개의 수의 최대공약수 출력
        //----------------------------------
        // 수1 : 18
        // 수2 : 12
        // 최대공약수 : 6 

        Scanner sc= new Scanner(System.in);
        System.out.print("수1: ");
        int su1 = sc.nextInt();

        System.out.print("수2: ");
        int su2= sc.nextInt();

        //반드시 su1이 작앗으면 좋겟다 - 그게 코드가 편해서

        if( su1 > su2){
            int su3 = su1;
            su1 = su2;
            su2 = su3;
        }

        int i = su1;

        for(; i>=1; i--){

            if( su1 % i ==0 && su2%i==0){
                break;
            }

        }//for
        System.out.println(i);
        System.out.println("------------------------");

        // 유클리드 호제법으로 최대공약수 구하기
        //(공식이라 코드가 편함)
        while( su2!=0 ){

            int tmp = su1 % su2;
            su1 = su2;
            su2 = tmp;
        }//while

        System.out.println("최대공약수 : "+su1);






        // my code
        // Scanner sc= new Scanner(System.in);
        // System.out.print("수1: ");
        // int a = sc.nextInt();
        // System.out.print("수2: ");
        // int b= sc.nextInt();
        // int maxc= 0;
        // //maxc= 최대공약수

        // for(int i=1; i<=a;i++){
        //     for(int j =1; j<=b; j++){
        //         if(a%i==0&& b%j==0&& i==j){
        //            if(j>maxc){
        //             maxc= j;
        //            }
                   
    
        //         }
        //     }
        // }//outer
        // System.out.println("최대공약수: "+maxc);


    }//main
}

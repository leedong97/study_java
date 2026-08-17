package ex6_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        // 입력받은 두 수의 최소공배수
        // --------------------
        // 수1 : 6
        // 수2 : 10
        // 최소공배수 : 30

        Scanner sc = new Scanner(System.in);

        System.out.print("수1: ");
        int su1= sc.nextInt();

        System.out.print("수2: ");
        int su2= sc.nextInt();

        for( int i =1; i<=su1*su2; i++){

            if( i % su1 ==0 && i %su2 ==0){
                System.out.println("최소공배수: "+ i);
                break;
            }
            

        }//for
    

        System.out.println("-----------------------");

        // 최소공배수 (유클리드 호제법)
        int x = su1;
        int y = su2;

        while( y!=0){
            int tmp = x%y;
            x = y;
            y = tmp;
        }
        int gcd = x; // 최대 공약수

        // 최소 공배수
        int lcm =(su1*su2)/gcd;
        System.out.println("최소공배수:"+ lcm);







        // my code
        // Scanner sc = new Scanner(System.in);
        // System.out.print("수1: ");
        // int a = sc.nextInt();

        // System.out.print("수2: ");
        // int b = sc.nextInt();
        // int minx = 0;

        // out :for(int i=a;i <=a*b;i++){
        //     for(int j=b;j<=a*b; j++){
        //         if(i%a ==0&& j%b ==0 && i==j){
        //             minx = j;
        //             break out;
        //         }
                
        //     }
        
        // }
        // System.out.println("최소공배수: "+minx);
        
    }// main
}

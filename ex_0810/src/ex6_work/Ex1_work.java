package ex6_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
       
        
        // 1부터 100까지의 숫자중에서
        // 키보드에서 입력받은 수 보다 큰 첫번째
        // 3의 배수를 찾아 출력
        //----------------------
        // 입력 : 55
        // 55보다 큰 첫번째 3의 배수 : 57
        // 입력 : 20
        // 20보다 큰 첫번째 3의 배수: 21
        Scanner sc= new Scanner(System.in);
        System.out.print("입력 :");
        int a = sc.nextInt();
        int b=0 ;
        
        for( b=0; b<100; b++){
            if(b>a && b%3==0){
                System.out.println(a+"보다 큰 첫번째 3의 배수: "+b);
                break;
                // break out;
            }
        }
        
        // int n =0;

        // while(0<n-a&& n-a<=3){
        //         n+=3;
        // }
        // System.out.print(a+"보다 큰 첫번째 3의 배수: "+n);












    } //main
}

package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 비교값으로 1 ~ 12월 사이의 값을 준비
        // 준비된 비교값에 해당하는 달이 몇일까지 있는지 출력
        // -------------------
        // 3월은 31일 까지 있습니다

      
        Scanner sc = new Scanner(System.in);   
        System.out.print("값을 입력하세요: ");    
        int n= sc.nextInt();
        switch(n){
           case 1:
           case 3:
           case 5: 
           case 7:
           case 8:
           case 12:
                System.out.println(n+"월은 31일까지");
                break;

           case 2:
                System.out.println(n+"월은 28일까지 ");
                 break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(n+"월은 30일까지");
                break;

            default:
                System.out.println("제대로 입력하세요");
                break;


        }





    }//main
}
















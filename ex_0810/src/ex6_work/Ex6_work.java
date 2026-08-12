package ex6_work;

import java.util.Scanner;
public class Ex6_work {
    public static void main(String[] args) {
        
        // 키보드에서 출력될 수열의 갯수를 지정하고
        // 피보나치 수열대로 결과 보여주기
        // -----------------------------
        // 입력 : 9
        // 1 1 2 3 5 8 13 21 34


        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");

        
        int a = sc.nextInt();
        int num1 =1;
        int num2= 1;
        

        for(int i=0; i<a; i++){
            
            System.out.print(num1+ " ");
            int num = num1;
            num1= num2;
            num2= num+ num2;           
            
        }

        //for
          
       





    }//main

   
   




}

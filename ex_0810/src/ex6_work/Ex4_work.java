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
        int a = sc.nextInt();
        System.out.print("수2: ");
        int b= sc.nextInt();
        int maxc= 0;
        //maxc= 최대공약수

        for(int i=1; i<=a;i++){
            for(int j =1; j<=b; j++){
                if(a%i==0&& b%j==0&& i==j){
                   if(j>maxc){
                    maxc= j;
                   }
                   
    
                }
            }
        }//outer
        System.out.println("최대공약수: "+maxc);


    }//main
}

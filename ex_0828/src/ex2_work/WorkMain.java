package ex2_work;

import java.util.Scanner;

public class WorkMain {
    
    public static void main(String[] args) {
        
        // 정수 : 7
        // 7은 소수입니다

        // 정수 :9
        // 9은 소수가 아닙니다.

        Scanner sc= new Scanner(System.in);
        System.out.print("정수 : ");
        int num= sc.nextInt();

        WorkSub ws = new WorkSub();
        if(ws.isPrime(num)){
            System.out.println(num+"은 소수입니다");

        }else{
            System.out.println(num+"은 소수가 아닙니다");
        }
        // int count =0;
        // for(int i =2; i<num;i++){
        //     if(num%i == 0){
        //         count++;
        //     }
        // }9
        // if(count ==0){
        //     System.out.printf("%d는 소수입니다",num);
            
        // }else{
        //     System.out.printf("%d는 소수가 아닙니다",num);
        // }
    }//main
}

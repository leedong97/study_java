package ex6_work;

import java.util.Scanner;

public class WorkSub {
    
    int num;
    
    Scanner sc= new Scanner(System.in);


    public boolean isPrime(int n){
        int i =2;
        for( ;i<=n; i++){

            if(n%i == 0)
                break;

        }// for

        if( i == n){
            return true;
        }else
            return false;
    }

    // public void workReturn(int num){
    //     num = sc.nextInt();
    //     int count =0;
    //     for(int i =2; i<num;i++){
    //         if(num/i==0){
    //             count++;
    //         }
    //     }
    //     if(count==0){
    //         System.out.printf("%d은(는) 소수입니다.",num);
    //     }else{
    //         System.out.printf("%d은(는) 소수입니다.",num);
    //     }
        
    // }
}

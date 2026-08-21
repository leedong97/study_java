package ex6_work;

import java.util.Scanner;

public class WorkMain {
 
    

    public static void main(String[] args){

        // 정수 : 9
        // 9은(는) 소수가 아닙니다.

        // 정수 : 7
        // 7은(는) 소수입니다.
        Scanner sc= new Scanner(System.in);
        System.out.print("정수: ");
        int n= sc.nextInt();
        WorkSub ws= new WorkSub();
        // ws.workReturn(a);
        boolean res =ws.isPrime(n);

        if( res )// res == true라는 if문이다
            System.out.println(n+"은 소수");
        else
            System.out.println(n+"은 소수가아니다.");



    }
}

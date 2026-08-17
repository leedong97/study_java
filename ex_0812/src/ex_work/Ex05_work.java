package ex_work;

import java.util.Scanner;

public class Ex05_work {
    
    public static void main(String[] args) {
        
/*
    학생 수를 입력하세요 : 3
    학생 1의 성적 : 90
    학생 2의 성적 : 73
    학생 3의 성적 : 84
    --------------------------
    평균성적 : 82.3333336
    ----평균 이상인 학생들 ---
    => 학생 1 : 90
    => 학생 3 : 84
    평균 이상인 학생 수 : 2

*/
    Scanner sc = new Scanner(System.in);
    System.out.print("학생 수를 입력하세요: ");
    int a= sc.nextInt();
    int[] arr = new int[a];
    // ㄴ이 구조가 조금 헷갈렷다 모르면 외우자.
    int cnt = 0;
    for(int i =0; i<a; i++){        
        System.out.printf("학생%d의 성적: ",i+1);
        arr[i]=sc.nextInt();
        cnt +=arr[i];
    }
    System.out.println("---------------");
    System.out.println("평균성적: "+(float)cnt/a);
    System.out.println("---평균 이상인 학생들----");
    int b=0;
    for(int i =0; i<a; i++){
        if(arr[i]> cnt/a){
            System.out.printf("학생%d : %d\n",i+1,arr[i]);
            b++;
        }
    }
    System.out.print("평균 이상인 학생 수 : "+b);
    




    }//main
}

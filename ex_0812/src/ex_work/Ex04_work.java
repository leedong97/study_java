package ex_work;

import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {
        /*
        배열의 크기를 입력하세요 :5
        정수1: 6
        정수2: 7
        정수3: 11
        정수4: 20
        정수5: 31    
        ----------------------
    
        짝수 개수: 2   
        홀수 개수: 3
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int a= sc.nextInt();
        int[] arr= new int[a];
        // int cnt1 =0;
        // int cnt2=0;

        // for (int i =0; i<size; i++){
        //     System.out.printf("정수%d: ",i+1);
        //     arr[i]= sc.nextInt();

        //     if( arr[i]%2 ==0){
        //         cnt1++;
        //     }else{
        //         cnt2++;
        //     }
        // }
        // System.out.println("짝수: "+ cnt1);
        // System.out.println("홀수: "+ cnt2);
        int cnt1 =0;
        int cnt2 =0;
        for(int i=0; i<a;i++){
           
            System.out.print("정수"+i+1+": ");
            int b= sc.nextInt();
            arr[i]= b;
            if(b%2 ==0){
               
                cnt1 +=1;
                // System.out.println("홀수 개수:"+cnt1);
            }else{
                
                cnt2 +=1;
                // System.out.println("짝수 개수: "+ cnt2);

            }

        }
        System.out.println("짝수 개수:"+cnt1);
        System.out.println("홀수 개수: "+ cnt2);
    }
}

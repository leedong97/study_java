package ex_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        
        // 입력 : 5 - length가 5인 배열
        // ABCDE라는 값을 가진 배열

        Scanner sc= new Scanner(System.in);
        System.out.print("입력: ");
        int a= sc.nextInt();

        char[] arr = new char[a];

        for(int i =0; i <arr.length; i++){
            arr[i] =(char)('A'+i);
            System.out.print(arr[i]);
        }
        // char[] b = new char[a];
        // b[0]='A';

        // for(int i =0; i<a; i++){
        //        System.out.print((char)(b[0]+i));
        //     }
        
        System.out.println();
        System.out.println("-------------------------");

        // char[] cArr = new char[a];
        // char ch = 'A';
        
        // for(int i =0; i<a; i++){

        //     System.out.print(cArr[i]= ch++);

        // }//for

     










    }//main
}

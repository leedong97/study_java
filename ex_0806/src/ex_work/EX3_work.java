package ex_work;

import java.util.Scanner;

public class EX3_work {
    public static void main(String[] args) {
        
        // 키보드에서 나이와 키를 입력받는다
        // 나이가 15세 이상이거나 키가 150cm 이상이면 탑승 가능
        // 그렇지 않으면 탑승불가

        // 나이: 14
        // 키: 140;
        // 탑승불가

        Scanner sc = new Scanner(System.in);
        // 키보드에서 값 받으려고 작성
        String str="";
        // 코드를 좀 짧게만드려고 변수를 하나 초기화 해놧다.

        System.out.print("나이를 입력해주세요: ");
        int age= sc.nextInt();
        // 키보드에서 정수값을 받아서 age라는 변수에 값을 삽입하겟다.
        System.out.print("키를 입력해주세요: ");
        int height=sc.nextInt();

        if(age>=15 || height >= 150)
        {
            str="탑승가능";
        }else{
            str="탑승불가";
        }
        System.out.println(str);
    }//main
}

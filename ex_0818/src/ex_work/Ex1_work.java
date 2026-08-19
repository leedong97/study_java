package ex_work;

import java.util.Scanner;

public class Ex1_work {
    // 키보드에서 입력받은 값이 회문인지 판단
    // --------------------------------
    // 회문이란 앞에서 읽으나 뒤에서 읽으나 같은애들
    // 토마토, 기러기, 오디오
    // 입력 : abcba
    // abcba은(는) 회문입니다.

    // 입력: abc
    // abc은(는) 회문이 아닙니다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");

        //원본
        String str = sc.next();

        StringBuffer sb = new StringBuffer(str);


        //원본을 뒤집어서 저장할 객체
        String rev = sb.reverse().toString();
        //StringBuffer라는 객체를 toString을 씀으로써 문자열로 나타낸다

        // for(int i = str.length()-1;i >=0;i--){
        //     rev += str.charAt(i);

        // }

        if( str.equals(rev)){
            System.out.println(str+ "은 회문");
        }else{
            System.out.println(str+"안 회문");
        }
       
    }
  
}

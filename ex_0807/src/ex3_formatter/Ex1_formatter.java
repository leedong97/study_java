package ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {
        
        // 저의 나이는 20살 입니다
        int age = 20;
        System.out.printf("저의 나이는 %d살 입니다\n",age);
        //n 줄바꿈

        // 저는 20살이고 3층에 살아요
     
        System.out.printf("저는 %d살이고 %03d층에 살아요\n",200, 3);
        //%0nd - 한자리수인데 앞에 0을 넣어서라도 n자리 숫자로만들어준다
        // 나는 박씨야
        System.out.printf("나는 %c씨야\n",'박');

        // 나는 a형이야
        System.out.printf("나는 %C형이야\n",'a');

        // 원주율 : 3.141592
        System.out.printf("원주율 : %.2f\n", 3.141592);
        // %.2f = 소수점 2자리까지만 보여준다는 말

        // 저는 홍길동 입니다
        System.out.printf("저는 %s 입니다\n","홍길동");

        System.out.printf("%s\t %d\t %d\n","김윤",100,95);

        System.out.printf("%s\t %d\t %d\n","김길동", 100 ,7);

        // 오늘 강수량은 15%입니다
        System.out.printf("오늘 강수량은 %d%%입니다\n",15);
        // %라는 문자를 찍고싶으면 %% 라고쓰자 %를 2개 써야한다.
    }//main


    /*
    formatter의 문법
    \n : 강제 줄바꿈
    %d : 정수 타입
    %c : 문자 타입
    %C : 문자를 대문자로 바꿔서 나온다.
    %f : 실수 타입
    %s : 문자열 타입 이지만 사실상 다른것들도 다 가능하다.
    \t : 탭키만큼 늘려줘서 결과값들의 라인을 맞추는데 용이하다. 탭키 이상이면 안맞는경우도 있다.
    %% : %특수문자
    */
}

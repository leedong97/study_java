package ex1_string;

import java.util.Scanner;

public class Ex1_string {
    public static void main(String[] args) {
        
        //String클래스의 두가지 특징
        // 1) 객체 생성방법이 2가지( 암시적, 명시적 )
        // 2) 한 번 생성된 문자열의 내용은 변하지 않는다.
        // 3) String 클래스만 암시적 생성이 가능한 유일한 클래스이다.

        String s1= "abc";
        // 이 코드를 메모리로 보자면 stack에 s1이 생성되고 heap의 주소값에 abc가 들어간다

        String s2= "abc";
        // 동일한 값으로 집어넣으려고한다면 위에서 s1이 참조하는 abc의 주소값을 공유하게된다.

        // -> 위에 2개 이것이 지금 암시적  객체 생성이다
        String s3= new String("abc");
        // new가 들어가면 " 무조건!!" 명시적 객체 생성이다
        // new 가 들어가면 위에서 abc의 참조값을 갖던 heap 올라간 주소를 따라가는게 아니라
        // 새로 주소값을 생성해서 거기서 참조한다.

        String s4 = new String("abc");

        //String클래스의 s1객체
        // heap에서의 주소를 가진건 다 객체라고 생각하면 된다.
        // 첫글자가 대문자인 클래스를 가진 변수를 객체라고한다


        // 여기서 == 은 값이 같다가 아니라 주소가 같은지를 확인하는거싱다
        // 그래서 s1객체, s3객체의 주소가 같은지 물은것이기 때문에 다르다고 나오는것이다
        if( s1== s3){         
            System.out.println("주소가 같습니다");
        }else {
            System.out.println("주소가 다릅니다");
        }

        // String 클래스의 불변의 법칙

        String greet = "안녕";
        greet +="하세요";
        System.out.println(greet);

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자: ");
        String op = sc.next();

        if(op.equals("+")){
            // 클래스안에 있는 매서드를 호출한다가 '.'이다
            // String 안에는 기본적으로 메서드가 많이있어서 그중에 equals메서드를 쓰는것이다.
            System.out.println("+연산 할게요");

        }


    }//main
}

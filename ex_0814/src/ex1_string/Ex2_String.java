package ex1_string;

import java.util.ArrayList;

public class Ex2_String {
    public static void main(String[] args) {
        
        //length 메서드는 int형만 쓸수있다 외워야한다.
        //length, eqauls, eqaulsIgnoreCase, trim은 엄청 자주쓴다
      
        String str = "Hong Gil Dong";
        int index = str.length();
        // 기능을 쓰는것이면 무조건 () 있다. --메서드
        System.out.println("str의 길이: "+ index);

        index = str.indexOf('o');
        //문자열 str 안에서 문자 'o'가 처음 등장하는 위치(인덱스 번호)를 찾아서 index에 저장한다.
        System.out.println("맨 처음 문자 o의 위치 : "+ index);

        index= str.indexOf("Gil");
        System.out.println("문자열 Gil의 위치: "+ index);

        index =str.lastIndexOf('o');
        System.out.println("마지막 문자 o의 위치: "+ index);

        char res =str.charAt(6);
        //문자열 str에서 인덱스 번호가 6인 문자 하나를 꺼내서 res에 저장한다는 뜻
        System.out.println("6번째 문자 : "+ res);

        String ss =str.substring(1,6);
        // substring()은 문자열의 일부를 잘라서 새로운 문자열로 가져오는 메소드다.
        // str 문자열에서 1번 인덱스부터 6번 인덱스 직전까지 잘라서 ss에 저장한다는 뜻
        System.out.println("잘라낸 문장: "+ss );

        String apple ="apple";
        if(apple.equals("apple")){
            System.out.println("사과");
        }
        //String 끼리는 "=="로 절대 비교하지마라. 이건 주소값을 비교하는것이기때문에
        // .equals로 비교하자.

        if(apple.equalsIgnoreCase("apple")){
            System.out.println("대소문자 상관없이 사과" );
        }
        // 위에 .equals랑 다르게 대소문자 상관없이 값을 비교해준다
        
        String password = " 1234";
        // 띄어쓰기 포함 문자열의 길이는 현재 5이다. 
        String pwd2 = password.trim();
        // trim 메서드를 사용하면 앞뒤 공백을 지우는 메서드이다.
        System.out.println(pwd2+"의 길이: "+pwd2.length());
        
        //이것은 String클래스에 내장된 메서드는 아니지만 많이써서 알려준다.
        //문자열로 작성된 숫자형태의 데이터를 실제 숫자로 바꿔주는 메서드
        String number = "100";
        int num = Integer.parseInt(number);
        System.out.println(num+1);

          // 기본자료형의 Wrapper 클래스
          //Wrapper 클래스란 - 기본 자료형을 객체처럼 다룰수 있게 감싸주는 클래스이다.
          // boolean -> Boolean
          // char -> Character
          // byte -> Byte
          // short -> Short
          // int -> Integer
          // long -> Long
          // float -> Float
          // double -> Double
         
        
    }//main
}

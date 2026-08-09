package variable_ex;

import java.util.Scanner;

public class Ex4_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요: ");
        String word= sc.next();

        // String[ ] arr = word.split("");
        // String first = arr[0];
        // String second = arr[1];
        // String third = arr[2];
        // 위에 개념은 배열로써 문자열을 문자를 하나씩 저장한것이다
        char first= word.charAt(0);
        char second=word.charAt(1);
        char third =word.charAt(2);
        // 배열을 모를때 혹은 쓰고싶지 않을때 쓰는 기능으로써 charAt는 문자열에서 원하는 위치의 문자를 하나 가져오는 메서드이며, 이건 java에서 제공하는 기본 메서드
        // 정확히는 String 클래스가 제공하는 기본 메서드중 하나라고한다.


        System.out.println("첫번째 문자 :"+ first);
        System.out.println("두번째 문자 :"+second);
        System.out.println("세번째 문자 :"+third);
    }
}

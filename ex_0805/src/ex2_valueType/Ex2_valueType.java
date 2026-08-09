package ex2_valueType;

public class Ex2_valueType {
    public static void main(String[] args) {
        //문자형 : 홑따옴표 안에 딱 한글자만 저장할 수 있는 자료형
        char ch = 'A';
        char ch2 = 65 + 1;
        // ch2는 오류가 아니다 아스키코드표때문이다. A = 65, B= 66 ...등이다
        System.out.println("ch: "+ch);
        System.out.println("ch2: "+ch2);

        // 실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
        float f1 = 100;
        f1 = 3.14F;
        // 기본적으로 jvm은 double이 기본값이라 float는 적어도F 라는 명시를 해줘야 사용이 가능하다.

        double d1= 3.14;
        System.out.println("f1 : "+ f1);
        System.out.println("d1 : "+ d1);
    }
}

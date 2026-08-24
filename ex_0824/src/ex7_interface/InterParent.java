package ex7_interface;

public interface InterParent {
    
    //인터페이스의 구성
    // 접근제한자                     인터페이스명
    // public       interface       InterParent{
    //    상수
    //    추상메서드
    //
    // }

    //final이라고 선언하면 상수로 선언이라 물리적으로 값을 바꿀수가아예없다.
    // 상수는 전부 '대문자'로 바꾸는게 개발자들의 약속이다.
    final int VALUE = 100;
    abstract int getValue();
    

















} 
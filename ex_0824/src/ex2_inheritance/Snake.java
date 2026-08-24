package ex2_inheritance;

public class Snake extends Animal{
    
    String merit = "밤에도 잘봄";

    @Override
    // 오버라이드 : 메서드의 재 정의
    // 오버 로딩 : 메서드의 중복 정의

    // 오버라이드
    // 상속 관계의 객체에서 부모의 함수를 자식이 가져와
    // 자식 사정에 맞도록 내용만 재정의 하는 것
    
    // 부모가 가진 메서드를 껍데기만 가져온다.
    // 자식 사정에 맞게 재정의가 가능하다.
    public int getLeg() {
        
        return 0;
    }
    




}

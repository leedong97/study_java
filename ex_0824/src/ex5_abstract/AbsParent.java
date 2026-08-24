package ex5_abstract;

// 추상클래스(absract)
// 추상 메서드가하나라도있으면 추상 클래스라고 정의해줘야한다
// -> 맨 앞에 abstract
abstract public class AbsParent {
    
    int value = 100;

    public int getValue(){
        return value;
    }



    // 추상메서드: 메서드의 몸체(body)가 없는
    // '미완서개념'의 메서드
    // 상속관계에서 자식이 받아서 완성시키는것을 조건으로한다.
    // abstract를 붙혀놓으면 추상메서드라는 뜻이다.
    // 그 메서드의 몸체가 없다 {}이것이 말이다.
   abstract public void setValue(int n); 


}

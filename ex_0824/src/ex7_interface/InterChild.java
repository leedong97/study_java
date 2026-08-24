package ex7_interface;

    // 인터페이스는 implements키워드를 통해 '구현'한다
public class InterChild implements InterParent{
    //인터페이스는 클래스랑은 다르게 상속이라는 말을 안쓰고
    // "구현"했다고 표현한다.


    //부모인 인터페이스가 가진 추상메서드를
    //자식이 반드시 가지고 있어야 한다.
    @Override
    public int getValue() {
        // TODO Auto-generated method stub
        return 0;
    }
}

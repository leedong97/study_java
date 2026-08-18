package ex1_method;

public class MethodTest {
    
    public void test1(){
        System.out.println("test1 메서드 호출");
    }

    public int test2(int n){
        n+=100;
        System.out.println("결과: "+n);

        // 나를 호출한 곳으로 return값을 딱 한개만 가지고 돌아간다.
        return n;
        // 반환타입이 void가 아닌경우는 무조건!!  resturn이 필요하다
        // 반환타입에 맞춰서 return 타입도 무조건 맞춰야한다.
        // return 밑에 있는 코드는 절대 실행이 안된다. break, continue와 같다.

    }

}

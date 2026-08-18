package ex1_method;

public class MethodMain {
    public static void main(String[] args) {
        
        MethodTest m1 = new MethodTest();
        m1.test1();

        int su = 100;
        su =m1.test2(su);
        // main에서 클래스로 보내줄때는 파라미터로 보내고
        // 클래스에서 main으로 보내줄때는 return으로 돌려주게된다.

        System.out.println("su: "+su);
        // 위에서 su랑 아래에서 su는 값이 다르다
        // 기본적으로 복사본이 넘어가기때문에 메서드를 거쳣을때는 값이 변할지는 몰라드
        // 원본 데이터는 값이 변하지 않는다.
    }
}

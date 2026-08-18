package ex2_method;

public class TestMain {
    
    public static void main(String[] args) {
        
        Test t1 = new Test();
        String res =t1.average(100, 80, 70);
        // 반환타입이 void 면 t1= t1.average 이런식으로는 절대 못받는다
        System.out.println("결과 : " +res);


    }//main
}

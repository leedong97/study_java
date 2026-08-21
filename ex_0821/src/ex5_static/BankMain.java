package ex5_static;

public class BankMain {
    
    public static void main(String[] args) {
        // static을 치면 static 영역에 생성이된다.
        Bank b1= new Bank("신촌", "02-111-1111");
        Bank b2 = new Bank("강남", "02-222-2222");
        Bank b3 = new Bank("역삼","02-333-3333");
        
        // static은 클래스명, 형식으로 접근가능
        // static은 클래스로 직접가는문법을 권장한다.
        // 인터페이스가 아니라.
        
        Bank.interest= 0.1f;
        

        b1.info();
        b2.info();
        b3.info();
        
        
    }





}

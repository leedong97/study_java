package computer;

public class ComMain {
   public static void main(String[] args) {
    
    Computer c1 = new Computer();
    //내가만든 Computer클래스에 c1이라는 변수명을 넣고 new로 객체를 생성했다.
    // c1.ssd -> 여기서 ' .'은 내부 접근자라고 불리며 여기서는
    // c1이라는 객체의 집에 들어가서 ssd라는 정보를 가져온다라는 뜻이다.
    c1.ssd =1024;
    c1.cpu = 3.5f;
    c1.color ="black";
    // private변수 brand로는 접근이 불가
    // c1.brand="apple";
    c1.info();

    System.out.println("-------------------------------");
    // 여기서 c1이 참조하는 heap의 주소값이랑 c2가 참조하는 heap의 주소값이 다르다
    // 이것은 명시적 생성이기 때문이다.
    Computer c2 = new Computer();
    c2.info();
    // System.out.println("브랜드: "+ c2.brand);
    // System.out.println("ssd: "+ c2.ssd);
    // System.out.println("ram: "+c2.ram);
    // System.out.println("cpu: "+c2.cpu);
    // System.out.println("cpu: "+c2.color);




   }//main 
}

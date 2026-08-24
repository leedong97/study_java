package ex4_super;

public class Child extends Parent{
    
    public Child(){
        // Parent(); -- 자동으로 나와서 숨겨져있다. 그걸 super라고한다
        // super은 부모클래스의 생성자(평소엔 생략되어잇지만 파라미터가 생기면
                    //               코드를 넣어야한다.)
        super(10);        
        
        System.out.println("자식 클래스의 생성자");

        
    }
    @Override
    public int getNum() {
        super.num = 100; // 부모의 num변수로 접근

        // 부모의 getNum()메서드 호출
        return super.getNum();
    }

    }


package ex3_constructor;

public class Pen {
 
    

    private String name;
    private int price;
    private String color;
    private boolean limited;

    //생성자는 클래스와 같은 이름에 대문자까지 쓰고 void도 없이 써야한다.
    public Pen(){
        this(false);
        // 자기자신의 생성자
        // limited를 파라미터로 받는 생성자 호출
    }
    // 생성자도 오버로딩이 된다
    // 한정판 생성을 위한 오버로딩 생성자
    public Pen(boolean limited){
        this.limited= limited;

        if(limited){// limited ==true 라는것과 동일한 코드다
            name ="모나미153-G";
            price = 20000;
            color = "금색";

        }else{
            name ="모나미153";
            price = 500;
            color = "흰색";

        }

    }
    public void info(){
            System.out.println("이름: "+ name);
            System.out.println("가격: "+price);
        if(!limited){ //limited == false라는 뜻이다
            System.out.print("일반판");
        }else{
            System.out.print("한정판");
        }
            System.out.println("/"+color);
            

            System.out.println("-------------------");

    }

}

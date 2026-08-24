package ex1_inheritance;

public class ExtendsMain {
    
    public static void main(String[] args) {
        
        Child c1 = new Child();
        System.out.println(c1.car);

        // 상속관계의 객체들에서 자식클래스는 
        // 부모가 가진 속성이나 메서드를 마음대로 가져다 쓸 수 있다.
        // 부모가 private로 만들지만 않으면 사용가능하다.
        // 속성 = 필드부에 선언된 변수들
        // 부모클레스와 자식 클래스의 관계를 확인할대
        // 인스턴스가 같은지 확인하면 된다.

        System.out.println(c1.money);
        System.out.println(c1.str);

        Parent p1= new Parent();
        // 부모 객체는 자식객체의 속성을 가져다 쓸 수가 없다.
        // System.out.println(p1.car);

        if(c1 instanceof Parent){
            System.out.println("c1은 Parent의 자식");
        }
    }//main


}

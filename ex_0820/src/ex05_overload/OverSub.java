package ex05_overload;

public class OverSub {
    
    // 오버로딩은 메서드의 '중복정의'라고 한다.
    // 하나의 클래스 내에서 같은 이름을 가진 메서드가 여러개 정의될 수 있도록 하는 것
    // sysout println이 대표적인 예시중 하나이다
    // ---- 오버로딩으로 인정되는 경우 ---
    // 1) 파라미터의 갯수가 다른 경우
    // 2) 파라미터의 타입이 다른 경우
    // 3) 파라미터의 타입과 갯수가 같지만 순서가 다른경우

    public void result(){
        System.out.println("인자가 없는 메서드");
    }

    // 위에 result랑 파라미터의 인자 갯수가 다르면 오버로드로 인정된다
    public void result(int n){
        System.out.println("정수를 인자로 받는 메서드");
    }

    public void result(char c){
        System.out.println("문자를 인자로 받는 메서드");
    }
    public void result(String s){
        System.out.println("문자열을 인자로 받는 메서드");
    }
    public void result(int n, String s){
        System.out.println("정수, 문자열을 인자로 받는 메서드");
    }
    public void result(String s, int n){
        System.out.println("문자열, 정수를 인자로 받는 메서드");
    }

    

}//main

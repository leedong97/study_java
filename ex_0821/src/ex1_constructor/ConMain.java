package ex1_constructor;

public class ConMain {

    public static void main(String[] args) {
        

        //생성자:
        // 객체가 생성될때 메모리 할당을 위해 딱 한번 "반드시" 호출되는것
        // 메서드의 성향이 강한데 일반 메서드랑은 다르다.
        // 일반 메서드처럼 다시 부르는게 절대 불가능하다.
        // ConSub cs =new ConSub();
        // new 만 쓰면 heap에 빈자리가 있나 찾아본다는 뜻이다
        // 빈자리에 집을 짓는 작업이 생성자가 하는것이다
        // 여기서 생성자는 ConSub 클레스랑 같은 이름으로 만든 것이다

        ConSub[] cs= new ConSub[2];

        cs[0]= new ConSub();
        cs[1]= new ConSub();





    }
    
}

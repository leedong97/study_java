package ex4_operator;

public class Ex3_oper {
    public static void main(String[] args) {
        
        //논리연산자
        //비교연산자를 통한 연산이 2개 이상일때 연결해주는 연산자
        int age = 30;
        int limit = 35;
        /*&&(and)연산자 공식
         true && true = true
         true && false= false
         false && true = false
         false && false= false
         */
       boolean res = (limit- age) > 5 && (age+=2)>30;
        // 지금 바로 위에서 되게 중요한 포인트가 앞의 논리가 fasle이기 때문에 앞이 false면 뒤에가 어떤값이오든 false이기때문에 뒤에 연산자를 계산을하지않는다
        // -> 그래서 age= 32라는 계산이 안되고 30이라는 값에서 그대로 멈춘다.
        System.out.println("&&연산:"+ res);
        System.out.println("age: "+age);

        //||(or) 연산자
        int i1 = 10;
        int i2 = 20;
        // or연산은 앞에꺼가 true이면 뒤에꺼를 하지도않고 참인 값을 낸다. 
        // false || false = false
        // false || true = true
        // true || false = true
        // true || true = true

        res = (i1 +=10 )> 20 || i2-10 == 11;         
        System.out.println("res: "+res);

        //!(not)연산자
        // 참을 거짓으로, 거짓을 참으로 변경하는 연산자
        System.out.println("!연산: "+!res);
        System.out.println(res);
        res = !res;
        System.out.println(res);

    }
    
}

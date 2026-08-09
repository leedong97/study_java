package ex4_operator;

public class Ex1_oper {
    public static void main(String[] args) {
        
        // 연산자(operator)
        //1. 최고연산자 : . , ()
        //2. 증감연산자 : ++, --
        //3. 산술연산자 : + , - , * , /, %
        //4. 시프트연산자 : >> , << , >>>
        //5. 비교연산자 : > , < , >= , <= , == , !=
        //6. 비트연산자 : & , |, ^, ~
        //7. 논리연산자 : &&, ||, !
        //8. 삼항(조건)연산자 : ? , :
        //9. 대입연산자 : =, *=, /=,%=,+=, -=

        // 1. 산술연산자
        int n1 = 20;
        int n2 = 7;
        int n3 = n1+n2;
        System.out.println("(+연산) n3: "+n3);

        // 나누기연산자인 '/'는 몫만 구하는것이다.
        n3 = n1/n2;
        // n3라는 변수를 재활용햇다. n3는 말그대로 변수이기 때문에 새로운 값을 넣을수 있다.
        System.out.println("(/연산)n3: "+n3);

        n3 = n1% n2;
        System.out.println("(%연산자)n3: "+n3);
    }
}

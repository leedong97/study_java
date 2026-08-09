package ex3_casting;

public class Ex1_casting {
    public static void main(String[] args) {
        //casting(형변환)
        //1. 프로모션
        // - 큰 자료형에 작은 자료형을 대입하는것(자동으로 된다.)
        double d1= 100.5; //8byte
        int n1= 200;      //4byte
        d1 = n1; // 대입연산자  d1= n1이라는 뜻은 '=' 왼쪽에 있는 d1에 n1의 값을 넣는다는 대입연산자이다.
        System.out.println("d1 : "+d1);
        // 200의 값이 200.0으로 형변환된것 이것이 'casting'이다.

        int n2= 100; //4byte
        char ch = 'A'; // 2byte
        n2 = ch;
        // n2(100)= ch('A')이다 이것이 가능한 이유는 'A'= 65라는 정수형을 가지고있고있기때문에 캐스팅(형변환)이 가능하다.
        System.out.println("n2: "+n2); 

    }
}

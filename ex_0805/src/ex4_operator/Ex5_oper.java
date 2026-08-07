package ex4_operator;

public class Ex5_oper {
    public static void main(String[] args) {

        // 삼항(조건)연산자
        // 기본 구조 :조건식 ? 참일때 값 : 거짓일때 값;
        // 기본 자료형과 뒤에 출력되는 값의 자료형 형태가 같아야한다.
        // 하나의 조건식을 통해 발생하는 결과를 원하는 타입으로
        // 반환할 수 있또록 하는 연산자
        int a = 10;
        int b= 15;
        int res = ++a >= b ? 100 : 200;
        System.out.println("res:"+res);
       
        int n1= 10;
        int n2= 20;
        float res2= (n1+= n1)== n2? 3.14F : 5.19F;
        System.out.println("res2: "+res2);


        a= 10;
        b= 12;
       char res3= ++a >= b || (a-8)+7 <= b && 13 - b >= 0 &&(a+=b) -(a%b) >10? '0':'X';
        System.out.println(res3);
        
    }//main
}//class end

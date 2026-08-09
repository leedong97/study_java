package ex2_valueType;

public class Ex1_valueType {
    public static void main(String[] args) {
        
        /* 
            자바의 기본 자료형 (데이터를 넣을 그릇이라고 생각하면 된다. 고체는 고체에 액체는 액체에 이런 느낌으로 이해하자)

            자바의 기본 자료형은 총 8가지가 있다.
            논리형 : boolean.... 1bit
            문자형 : char.... 2byte            
            정수형 : byte...1byte  -> -128 ~ 127
                    short...2byte -> -32768 ~ 32767
                    int...4byte -> -21억 ~ 21억
                    long....  8byte -> -922경 ~ 922경

            실수형 : float...4.x byte -> 1.40129846432481707e-45 ~ 3.40282346638528860e+38
                    double.... 8.x byte -> 4.94065645841246544e-324 ~ 1.79769313486231570e+308
            
            변수 : 데이터를 저장하는 공간
            자료형 변수명;(변수의 선언) - int a;(int라는 자료형에 a라는 이름을 붙혀준다는 뜻)
            변수명 = 값; (대입) - a=10;(a라는 변수에 10이라는 값을 넣는다는 뜻)

            자료형 변수명= 값;(초기화)
              -> 선언과 대입을 한번에 하는것을 초기화했다고 표현한다.
               int a=10;(int라는 자료형에 a라는 이름을 붙혀준다는 뜻에 10이라는 값을 넣는다는 뜻)
               int 자료형에 a 라는 변수명을 지어주고 10의 값을 초기화 했다.
            )

            변수선언 규칙(데이터에 이름을 붙혀준다고 생각하자)
            1. 숫자로 시작할수 없다,
            2. _를 제외하고 특수문자를 사용할 수 없다(공백도 x)
            3. 한글로 변수이름 짓지 않는다
            4. 반드시 소문자로 알파벳으로 시작하도록 한다

         */
    // 변수 이름을 작성할 때 자주 사용되는 표기법들에 대해 알아보자.
    // 1. 카멜표기법(Camel Case)
    //    - 첫 단어는 소문자로 시작하고, 그 다음 붙는 단어의 첫 글자를 대문자로 쓴다.
    //    - 예시: userName, studentAge, totalScore
    //
    // 2. 파스칼표기법(Pascal Case)
    //    - 모든 단어의 첫 글자를 대문자로 쓴다.
    //    - 주로 클래스명에 사용된다.
    //    - 예시: UserName, StudentAge, TotalScore
    //
    // 3. 헝가리안 표기법(Hungarian Notation)
    //    - 자료형이나 용도를 접두사로 붙여서 변수명을 만든다.
    //    - 예시: strName(문자열), iCount(정수), bFlag(불린), dblValue(더블형)
    //
    // 4. 스네이크표기법(Snake Case)
    //    - 모든 단어를 소문자로 작성하며, 단어와 단어 사이를 밑줄(_)로 연결한다.
    //    - 예시: user_name, student_age, total_score

            //논리형 : 참과 거짓(true, false)의 두 가지 값만을
            //저장할 수 있는 자료형
            boolean b1; // 선언
            b1 =true;// 대입
            b1 = false;
            // b1 = 10; <-- 자료형 타입이 올바르지 않기 때문에 오류 발생
            System.out.println("b1 : "+b1);

            // 정수형 : 소수점이 없는 정수값만 저장하는 자료형
            byte b = 127;
            short s = 32767;
            int n = 5000;
            long lo =2200000000L;
            // long 타입은 제대로 넣어도 오류가 난다. 자바 기본 정수형이 int로 설정되어있어서 그걸 초과하는 long은 l이라고 따로 또 적어줘야
            // 제대로된 값이 나온다.
            // 바로 위 3가지가 "초기화"를 한 것이다.
            System.out.println("b :"+b);
            System.out.println("s: "+s);
            System.out.println("n: "+n);
            System.out.println("lo: "+lo);
    }
}

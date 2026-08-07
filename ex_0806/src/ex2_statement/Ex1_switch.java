package ex2_statement;

public class Ex1_switch {
    public static void main(String[] args) {

        /*
         * switch-case문
         * 비교값과 조건값을 통해서 원하는 결과를 얻어내기 위한 제어문
         * 특정값을 바로 찾아서 실행하기 때문에 else-if에 비해 속도가 빠르다
         * 
         * switch 문은 비교값으로 쓸수있는 자료형으로는
         * 1. 정수(byte, short, int)
         * 2. 문자열(String)
         * 3. 문자(char)
         * 만 가능하다.
         * 
         * 
         * switch( 비교값 ){
         * case 조건값:
         * 비교값과 조건값이 일치할 때 실행되는 영역
         * break;
         * }
         * 
         */
        int n = 4;

        switch (n) { // 비교값
            //switch문은 위에서 부터아래로 돌아가는 구조가 아니고 맞는 
            // 케이스로만 바로 가서 처리속도가 되게 빠르다
            case 1:// 조건값이 같으면 실행이 안된다.
                System.out.println("게임시작");
                break;

            case 2:
                System.out.println("설정");
                break;

            case 3:
                System.out.println("종료");

            default:
                // 비교값과 일치하는 조건값이 하나도 없을 때
                // 반드시 호출되는 영역
                System.out.println("올바른 값을 입력하세요");
                break;
        }// switch

    }// main
}// class closed

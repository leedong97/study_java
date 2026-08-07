package ex1_statement;
public class Ex1_if {
    public static void main(String[] args) {
       
        /* 
        //제어문 - 프로그램의 흐름을 제어하는 문장
        //분기문과 반복문으로 나뉜다.
        //분기문 : if, switch
        //반복문 : for, while, do-while

        // if문
        // if(조건식){
                조건식이 참일때 실행되는 영역
    
                    }
        */
        int n = 49;                  // 변수 n을 49로 초기화
        String str = "";             // 결과를 저장할 문자열 변수 str을 빈 문자열로 초기화

        // n이 50과 같으면 str에 "n은 50입니다"를 저장
        if(n == 50){
            str = "n은 50입니다";
        }

        // n이 50이 아니면 str에 "n은 50이 아닙니다"를 저장
        if(n != 50){
            str = "n은 50이 아닙니다";
        }

        System.out.println(str);     // str 변수에 저장된 결과를 출력
    }//main
}//class closed

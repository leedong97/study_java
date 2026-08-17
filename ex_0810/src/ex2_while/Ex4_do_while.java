package ex2_while;

public class Ex4_do_while {
    
    public static void main(String[] args) {
        
        //do- while 문:
        // 선 처리 후 비교

        int i = 11;

        do{

            System.out.println(i);
            i++;
        }while( i <= 10 );
        // 조건이 참인지 아닌지는 안중요하고 일단 do를 실행해버리고 조건이 참이면 그때 while문을 종료한다.
        System.out.println(i);
    }
}

package ex_work;

import java.util.Random;

public class Ex3_work {
    public static void main(String[] args) {
        
        // A ~ Z사이의 값중 하나를 랜덤으로 출력
        // int a = new Random().nextInt(26)+65;
        // char ch = (char)a;
        // System.out.println(ch);
        
        //아스키코드 모를때- 밑에처럼 코드를 쳐도 알아서 아스키 코드를 연산해줘서 한다.
        int rnd = new Random().nextInt('Z'-'A'+1)+'A';
        System.out.println((char)rnd);
    }
}

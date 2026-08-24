package ex11_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {


    public static void main(String[] args) {

        // 문제 : APPLE(랜덤으로 하나를 찍어주면)
        //        ->PEALP(로 출력)
        // >> ealpp
        //ealpp 오답
        // >> apple
        // apple 2회만에 정답!!

        WorkSub ws =new WorkSub();

        //정답 단어
        String answer = ws.getAnswer();

        //정답을 섞어서 문제로만들기
        String quesiton = ws.scrambleWord(answer);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("문제: "+ quesiton );


        while(true){
            System.out.println(" >> ");
            String str = sc.next();

            if(str.equalsIgnoreCase(answer)){
                System.out.println(str + "은 정답입니다");
                break;
            }else{
                System.out.println(str+ "은 오답입니다");
            }
        }// while
        
      




    }//main

    
}

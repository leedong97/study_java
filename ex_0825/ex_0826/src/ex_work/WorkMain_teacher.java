package ex_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain_teacher {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rnd = new Random();
        int playCount = 0;
        final int FINISH = 5;
        // 실무에 가깝게만든다면 코드 바깥에 따로 변수를하나두고
        // 그걸 final 상수로 한다.

        TimerSub ts = new TimerSub();
        ts.start();// 타이머 시작


        while(true){

            if(playCount == FINISH){
                ts.setCheck(false);
                break;
            }else{
                try{
                    int su1 = rnd.nextInt(100)+1;
                    int su2 = rnd.nextInt(100)+1;
                    System.out.println(su1+su2);
                    System.out.printf("%d + %d = ",su1,su2);

                    int res= sc.nextInt();

                    if(res ==su1+su2){
                        System.out.println("정답입니다.");
                        playCount++;
                    }else{
                        System.out.println("오답입니다");
                    }
                }catch(Exception e){
                    System.out.println("정답을 정수로 입력해야 합니다");
                }
            }

        }//while



    }
}

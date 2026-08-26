package ex8_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkThread implements Runnable {
    private String data[];
    private boolean isCheck = true;
    Random rnd = new Random();
    private List<String> list;

    // public void getCheck(boolean isCheck) {
    //     this.isCheck = isCheck;
    // }

    public void setCheck(boolean isCheck) {
        this.isCheck = isCheck;
    }

    // 생성자는 반환형이 없고 클래스명을 그대로 입력해야한다.
    public WorkThread(String[] data, boolean isCheck,List<String> list) {
        this.data = data;
        this.isCheck = isCheck;
        this.list =list;
    }

    @Override
    // run은 오버라이딩받은것이라 파라미터뿐아니라 틀을 수정을 못한다.
    public void run() {

       
        for(int i = 5; i >= 0; i--){
            try {
                Thread.sleep(1000);
                System.out.println(i + "초");
            } catch (Exception e) {
            }
        }
        System.out.println("게임시작!!!");

        while (true) {
            try {
                
                int rndnum = rnd.nextInt(6);
                
                list.add(data[rndnum]);
                System.out.println();
                System.out.println(list);
                System.out.print("입력: ");
                Thread.sleep(5000);
                // Thread.sleep은 예외가 자주 발생하는구문이라
                // try-catch가 필수이다.
                if (isCheck == false) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}

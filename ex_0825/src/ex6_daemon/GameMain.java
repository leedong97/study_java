package ex6_daemon;

public class GameMain {
    
    public static void main(String[] args) {
        
        // 데몬 스레드
        // 주스레드가 도는동안 다른 스레드의 작업을 돋는 보조적인 역할을 수행하는 스레드
        // 메인 스레드가 종료되면 데몬스레드도 강제로 함께 종료된다

        SaveCls sc = new SaveCls();
        sc.setDaemon(true);// 너를 실행시킨 곳이 끝나면 너도 실행을 종료해라
                              // sc스레드를 데몬스레드로 지정
        sc.start(); // 3초간격으로 게임을 저장


        //main 스레드는 20초동안 게임을 진행
        for(int i =0; i<20; i++){

            try{
                Thread.sleep(1000);
                System.out.println("게임중...");
            }catch(Exception e){

            }

        }//for

    }//main
}

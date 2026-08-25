package ex1_thread;

public class ThreadSub extends Thread {
    //Thread의 가장 기본적인 형태
    // run을 오버라이딩을 무조건해야한다.

    @Override
    public void run() {
        // 프로세스의 독립적인 수행을 위한 영역
        for(int i = 0; i<10; i++){

            // 0.5초간 휴식
            try{
                Thread.sleep(500);
                // 클래스명.메서드 (스태틱에 대한 개념 공부 다시하자)

            }catch(Exception e){

            }
            System.out.println("스레드 실행중");

        }// for

    }
}

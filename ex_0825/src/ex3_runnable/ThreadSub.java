package ex3_runnable;

public class ThreadSub implements Runnable{
    // 인터페이스를 구현받았다
    // 인터페이스는 추상메서드나, 상수밖에없어서
    // 추상메서드인 run을 오버라이딩 받아야 시작이된다.

    @Override
    public void run() {
    
        for(int i =0; i<10; i++){

            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(Exception e){

            }
        }//for
        
    }
}

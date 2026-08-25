package ex1_thread;

import java.security.spec.ECFieldF2m;

public class ThreadMain {
    
   
    public static void main(String[] args) {
        ThreadSub ts = new ThreadSub();
        ts.start();
        // start는 run이라는 메서드를 찾아서 스레드를 동작 시킨다(약속)

        try{
            Thread.sleep(1500);
        }catch(Exception e){
            
        }
        System.out.println("메인 스레드가 종료되엇어요");
    }
}

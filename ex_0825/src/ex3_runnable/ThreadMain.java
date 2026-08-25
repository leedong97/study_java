package ex3_runnable;

public class ThreadMain {
    
    public static void main(String[] args) {
        
        ThreadSub ts = new ThreadSub();
        Thread t = new Thread(ts);//<<- 중요코드
        // 인터페이스는 기능만있고 쓰레드는 run만 있어서
        // 매개변수로 연결해서 start기능을 사용할수 있게된다.

        t.start();

    }//main
}

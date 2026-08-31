package ex2_listener;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameMain {
    
    public static void main(String[] args) {
        
        Frame f= new Frame();
        f.setLocation(600,200);
        f.setSize(300,200);

        // 생성된 프레임의 우상단 메뉴에 대한 클릭을 감지
        // 이건 지금 인터페이스이다
        WindowListener listen = new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                // 창이 열릴 때 호출
            }

            @Override
            public void windowClosing(WindowEvent e) {
                // 창이 닫히기 직전에 호출
                System.out.println("종료를 시도함");
                // 종료를하고싶으면 exit를 넣어라
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // 창이 닫힌 후에 호출
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // 창이 아이콘화(최소화) 될 때 호출
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // 창이 아이콘화에서 풀릴 때 호출
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // 창이 활성화될 때 호출
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // 창이 비활성화될 때 호출
            }
        };

        
        f.addWindowListener(listen);


        f.setVisible(true);



    }//main
}

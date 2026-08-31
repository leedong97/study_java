package ex3_listener;

import java.awt.*;

public class FrameMain {
    
    public static void main(String[] args) {
        Frame f = new Frame();
        // f.setSize(300,300);
        // f.setLocation(500,200);
        f.setBounds(500,200,300,300); //location정보랑 size정보를 한번에 넣은 메서드

        //우상단 x 버튼 클림 감지
        f.addWindowListener(new MyEvent());
        
        f.setVisible(true);
    }
}

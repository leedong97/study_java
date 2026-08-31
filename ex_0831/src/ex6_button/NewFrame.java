package ex6_button;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NewFrame extends Frame {
    
    public NewFrame(Frame f){

        setBounds(f.getX()+100,f.getY()+100,200,100);
        setBackground(Color.YELLOW);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                
                // 아래 코드는 열려있는 모든 프레임을 다 종료한다는 뜻이다.
                // System.exit(0);

                // 현재 프레임만 단독으로 종료한다는 뜻이다.
                dispose();
                // 이 코드에서 this.을 쓰면 매개변수쪽에 있는 new adapter의 주소값을 참조하게되서 문법상 말이 안된다.
            }
        });
        //새로 생성되는 현재 프레임의 크기를 고정
        setResizable(false);

        setVisible(true);

    }//생성자
}

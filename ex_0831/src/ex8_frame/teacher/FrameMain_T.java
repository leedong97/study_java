package ex8_frame.teacher;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain_T {
    
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(500, 200, 500, 400);
        
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                
                //종료를 위한 프레임 띄우기
                new NewFrame(f);


            }
        });










    }//main
}

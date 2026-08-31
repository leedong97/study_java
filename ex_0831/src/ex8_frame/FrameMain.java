package ex8_frame;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(500, 100, 700, 300);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Frame f2 = new Frame();
                f2.setBounds(600, 150, 250, 150);
                ;
                Label q1 = new Label("종료하시겠습니까?");
                q1.setBounds(50, 30, 150, 30);
                f2.setLayout(null);

                Button btn1 = new Button("확인");
                btn1.setBounds(50, 50, 50, 50);
                Button btn2 = new Button("취소");
                btn2.setBounds(110, 50, 50, 50);

                f2.add(q1);
                f2.add(btn1);
                f2.add(btn2);
                f2.setVisible(true);

                btn1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        System.exit(0);
                    }

                });

                btn2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        f2.dispose();
                    }
                });

            }
        });

        f.setVisible(true);
    }// main
}

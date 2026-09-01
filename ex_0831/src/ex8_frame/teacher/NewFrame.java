package ex8_frame.teacher;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NewFrame extends Frame {

    public NewFrame(Frame f) {
        setBounds(f.getX() + 100, f.getY() + 100, 300, 200);
        setLayout(null);
        setVisible(true);

        Font font = new Font("", Font.BOLD, 30);
        Label label = new Label("종료할까요?");
        label.setFont(font);
        label.setBounds(50, 50, 200, 30);

        // 예, 아니오 버튼 추가
        Button yesBtn = new Button("예");
        Button noBtn = new Button("아니오");
        yesBtn.setBounds(30, 100, 105, 40);
        noBtn.setBounds(165, 100, 105, 40);
            
        // 버튼들에게 이벤트 감지자를 등록
        yesBtn.addActionListener(act);
        noBtn.addActionListener(act);


        // 현재 프레임에 컴포넌트들 추가
        add(label);
        add(yesBtn);
        add(noBtn);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }// 생성자

    // 예, 아니오 버튼이 참조할 감지자 생성
    ActionListener act = new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            
            switch(e.getActionCommand()){

                case "예":
                System.exit(0);
                break;

                case "아니오":
                dispose();
                break;
            }
        }

    };

}

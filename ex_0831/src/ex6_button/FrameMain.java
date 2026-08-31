package ex6_button;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class FrameMain {
    
    public static void main(String[] args) {
        
        Frame f= new Frame();
        f.setBounds(500,200,400,400);

        //이 set.Layout 이걸 안하면 버튼의 크기를 아무리 바꿔도 바뀐게 적용이 안된다, 개념까진 알필요없다
        f.setLayout(null);//프레임의 자동배치를 끈다는 뜻이다.

        Button btn1 = new Button("확인");
        btn1.setBounds(50,100,100,150);

        Button btn2 = new Button("취소");
        btn2.setBounds(200,100,100,100);

        //프레임에 버튼 추가
        f.add(btn1);
        f.add(btn2);

        // 확인버튼에 이벤트 감지자 추가
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("확인버튼 클릭함");
            }

        };
        btn1.addActionListener(act);//버튼1 누르면 actionPerformed메서드 호출

        // 취소버튼에 이벤트 감지자 추가
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("취소버튼 클릭함");
            }
   
        });


        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);

    }//main
}

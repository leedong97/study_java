package ex1_choice;

import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceMain {
    
    public static void main(String[] args) {
        
        Frame f = new Frame();
        f.setBounds(500,100,400,300);
        f.setLayout(null);
        f.setVisible(true);

        Choice day = new Choice();
        day.add("일요일");
        day.add("월요일");
        day.add("화요일");
        day.add("수요일");
        day.add("목요일");
        day.add("금요일");
        day.add("토요일");
        day.setBounds(50,50,120,0);

        //Choice 객체에 감지자 등록
        day.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
              
              System.out.println(day.getSelectedItem());  
            };

        });

        // 프레임에 Choice 객체 추가
        f.add(day);
        


        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });// 취소버튼



    }//main
}

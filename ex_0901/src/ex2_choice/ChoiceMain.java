package ex2_choice;

import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceMain {
    
    public static void main(String[] args) {

        
        Frame f= new Frame();
        f.setBounds(500,100,500,300);
        f.setLayout(null);//자동배치 끄기
        f.setVisible(true);
        
        

        Choice area =new Choice();
        area.add("지역선택");
        area.add("서울");
        area.add("경기");
        area.add("인천");
        area.add("파주");
        area.add("대구");
        area.add("대전");
        area.add("부산");
        area.setBounds(50,100,100,0);

        Label resLabel = new Label("");
        resLabel.setBounds(170,200,100,30);

        //Choice객체의 변경을 감지하는 감지자 추가
        area.addItemListener(new ChoiceListener(resLabel));

        

        f.add(resLabel);
        f.add(area);


       
        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });// 취소버튼
    }
}

package ex3_form;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class formMain {
    public static void main(String[] args) {
        Frame f= new Frame();
        f.setBounds(500,200,400,600);
        f.setBackground(Color.green);
        f.setLayout(null);
        Font font = new Font("",Font.PLAIN,30);

        //최상단
        TextField tf = new TextField();
        tf.setFont(font);
        tf.setBounds(10,35,280,30);

        Button btn = new Button("입력");
        btn.setEnabled(false);//버튼 비활성화
        btn.setBounds(300,35,80,35);

        // 중앙단
        TextArea ta = new TextArea();
        ta.setFont(font);
        ta.setBounds(10, 70, 380,450);
        ta.setEditable(false);// ta에 직접 값을 입력할 수 없다

        // 최하단
        Button btnSave = new Button("저장");
        Button btnClose = new Button("종료");
        btnSave.setBounds(30,530,150,50);
        btnClose.setBounds(235,530,150,50);

        //tf에 값이 들어간 경우를 감지
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(java.awt.event.TextEvent e) {
            // textValueChanged 메서드는 텍스트필드 내용이 변경될 때 호출됨
                if(tf.getText().trim().equals("")){
                    //버튼클릭 비활성화
                    btn.setEnabled(false);
                }else{
                    //버튼클릭 활성화
                    btn.setEnabled(true);
                }
            }

        });

        //입력버튼에 클릭을 감지
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                ta.append(tf.getText()+"\n");
                tf.setText("");
                tf.requestFocus();//커서가 textarea로 가서 textField로 옮겨 준것
            }
        });

        // tf에서 키보드의 엔터값을 감지
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_ENTER){
                    ta.append(tf.getText()+"\n");
                    tf.setText("");
                    tf.requestFocus();
                }
            }
        });

        // 종료버튼 클릭 감지
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                System.exit(0);
            }
        });
        
        // 저장버튼 클릭 감지
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String msg =ta.getText();

                FileWriter fw = null;
                BufferedWriter bw= null;

                try{
                    FileDialog fd = 
                        new FileDialog(f,"저장", FileDialog.SAVE);
                    fd.setVisible(true);

                    String path = fd.getDirectory()+ fd.getFile();
                    System.out.println(path);

                    //msg를 저장
                    fw =new FileWriter(path);
                    bw = new BufferedWriter(fw);

                    bw.write(msg);

                    bw.flush();

                }catch(Exception e2){

                }finally{
                    try{
                        if(bw != null) bw.close();
                        if(fw != null) fw.close();
                    }catch(Exception e3){

                    }
                }
            }
            
        });

        f.add(tf);
        f.add(btn);
        f.add(ta);
        f.add(btnSave);
        f.add(btnClose);

        // 강제로 프레임 크기를조정하지 못하도록 설정
        f.setResizable(false);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });// 취소버튼
    }
}

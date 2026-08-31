package ex1_frame;
import java.awt.*; //ui 패키지 임포트해야 쓸수있다.





public class Ex1_Frame {
    
    public static void main(String[] args) {
        
        Frame frame = new Frame();
        frame.setSize(400,300);//너비
        frame.setLocation(500,100);// 시작위치 지정
        frame.setBackground(Color.GRAY);


        frame.setVisible(true);

    }//main
}

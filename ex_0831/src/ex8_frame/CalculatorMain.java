package ex8_frame;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class CalculatorMain {
    public static void main(String[] args) {
    
    Frame f= new Frame();
    f.setBounds(500,200,800,800);
    f.setVisible(true);
    f.setLayout(null);
    
    Button btn0 = new Button("0");
    btn0.setBounds(30,50,50,50);

    Button btn1 = new Button("1");
    btn1.setBounds(90,50,50,50);

    Button btn2 = new Button("2");
    btn2.setBounds(150,50,50,50);

    Button btn3 = new Button("3");
    btn3.setBounds(210,50,50,50);

    Button btn4 = new Button("4");
    btn4.setBounds(270,50,50,50);

    Button btn5 = new Button("5");
    btn5.setBounds(30,110,50,50);

    Button btn6 = new Button("6");
    btn6.setBounds(90,110,50,50);

    Button btn7 = new Button("7");
    btn7.setBounds(150,110,50,50);

    Button btn8 = new Button("8");
    btn8.setBounds(210,110,50,50);

    Button btn9 = new Button("9");
    btn9.setBounds(270,110,50,50);

    Button btnPlus = new Button("+");
    btnPlus.setBounds(30,170,50,50);
    Button btnMinus = new Button("-");
    btnMinus.setBounds(90,170,50,50);
    Button btnDivide = new Button("/");
    btnDivide.setBounds(150,170,50,50);
    Button btnMultiply = new Button("*");
    btnMultiply.setBounds(210,170,50,50);
    Button btnEquals = new Button("=");
    btnEquals.setBounds(270,170,50,50);
    Button btnReset = new Button("C");
    btnReset.setBounds(270,230,50,50);


    //프레임에 버튼추가
    f.add(btn0);
    f.add(btn1);
    f.add(btn2);
    f.add(btn3);
    f.add(btn4);
    f.add(btn5);
    f.add(btn6);
    f.add(btn7);
    f.add(btn8);
    f.add(btn9);
    f.add(btnPlus);
    f.add(btnMinus);
    f.add(btnMultiply);
    f.add(btnDivide);
    f.add(btnEquals);
    f.add(btnReset);
    
    
    //보이게만들기
    btn0.setVisible(true);
    btn1.setVisible(true);
    btn2.setVisible(true);
    btn3.setVisible(true);
    btn4.setVisible(true);
    btn5.setVisible(true);
    btn6.setVisible(true);
    btn7.setVisible(true);
    btn8.setVisible(true);
    btn9.setVisible(true);
    btnPlus.setVisible(true);
    btnMinus.setVisible(true);
    btnDivide.setVisible(true);
    btnMultiply.setVisible(true);
    btnEquals.setVisible(true);
    btnReset.setVisible(true);
    
   
    // textField 부분
    TextField display = new TextField();
    display.setBounds(30,230,200,50);
    f.add(display);
    display.setVisible(true);

    
    ActionListener act = new ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
         switch(e.getActionCommand()){
            case "0":
            case "1":
            case "2":     
            case "3":         
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                display.setText(display.getText()+e.getActionCommand());
            case "+":
            break;

            case "-":
            break;

            case "*":
            break;

            case "/":
            break;

            case "C":

            break;
         }
    }
    };
















    f.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });// 취소버튼
    }//main
}
